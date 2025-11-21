import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.ArrayList;
import ymlComponents.YMLComponent;

public class Main {

	public static ArrayList<YMLComponent> ComponentsList;

    public static void main(String[] args) throws Exception {
		//FILE TO CONVERT:
		java.io.File file = FileSystem.FileChooser.getFile();
		if (file == null){throw new Exception("NO FILE");}

		//CONVERT YML TO LIST OF COMPONENTS
		ComponentsList = new java.util.ArrayList<ymlComponents.YMLComponent>();
		ComponentsList = YMLReader.YmlToComponentList(file);

		System.out.println(ComponentsList.size());

		int i = 0;
		for(YMLComponent cur: ComponentsList){

			cur.PrintDebug();
			i++;
		}

		System.out.println("DONE");
	}





}