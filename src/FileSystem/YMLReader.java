package FileSystem;

import ymlComponents.*;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;
import java.lang.Double;
import java.lang.Integer;

public class YMLReader {

	public static YMLGroupHeader currentHeader;

	public static ArrayList<YMLComponent> YmlToComponentList(File file) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(file));

		//TODO ADD REGEX SUPPORT FOR TRAILING COMMENTS
		Pattern pattern = Pattern.compile("([A-Za-z-]+)(:?)\\s*((?:[A-Za-z*]+)|(?:[1-9]\\d*))*");

		ArrayList<YMLComponent> componentsList = new ArrayList<>();

		String line;
		YMLGroupHeader currentHeader = null;
		while ((line = br.readLine()) != null) {

			//PURE COMMENT LINES
			if (line.startsWith("#") || line.trim().isEmpty()) {
				YMLComment comment = new YMLComment(line);
				componentsList.add(comment);
				continue;
			}

			Matcher matcher = pattern.matcher(line);
			if(matcher.groupCount() == 2){continue;}

			if (matcher.find()) {

				String key = matcher.group(1);
				String colon = matcher.group(2);
				String value = matcher.group(3);

				if(key == null || colon == null)
				{continue;}

				//HEADER
				if(value == null){
					YMLGroupHeader component = new ymlComponents.YMLGroupHeader(key);
					componentsList.add(component);
					addToHeader(component);
					continue;
				}

				// BOOLEAN VALUES
				if (value.equals("true") || value.equals("false")) {
					YMLBoolean component = new YMLBoolean(key, Boolean.parseBoolean(value));
					componentsList.add(component);
					addToHeader(component);
					continue;
				}


				/// NUMBERS PARSERS AND SUCH
				{
					// INT VALUES
					try {
						Integer intvalue = Integer.parseInt(value);
						YMLInteger component = new ymlComponents.YMLInteger(key, intvalue);
						componentsList.add(component);
						addToHeader(component);
						continue;

					} catch (NumberFormatException e) {
						e.printStackTrace();
					}

					// DOUBLES VALUES

					try {
						Double doubleValue  = Double.parseDouble(value);
						ymlComponents.YMLDouble component = new ymlComponents.YMLDouble(key, doubleValue);
						componentsList.add(component);
						addToHeader(component);
						continue;

					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
				}

				ymlComponents.YMLMISSES component = new ymlComponents.YMLMISSES(key,  colon , value);
				componentsList.add(component);
				addToHeader(component);

			}
		}

		return componentsList;
	}

	public static void addToHeader(YMLComponent component){
		// if Current header latest component is header make current header head (Recursive headers)
		if(component instanceof YMLGroupHeader){
			if(currentHeader == null){
				if(component instanceof YMLGroupHeader){
					currentHeader = (YMLGroupHeader) component;
				}
				return;
			}

			if(currentHeader.componentslist.getLast() instanceof YMLGroupHeader)
			{
				currentHeader = (YMLGroupHeader) currentHeader.componentslist.getLast();
			}
			currentHeader.addToComponentsList(component);
		}
		else{
			if(currentHeader == null){return;}
			currentHeader.addToComponentsList(component);
		}
	}
}
