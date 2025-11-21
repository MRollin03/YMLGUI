package ymlComponents;
import java.util.ArrayList;

public class YMLGroupHeader extends YMLComponent{

	public ArrayList<YMLComponent> componentslist;
	public YMLGroupHeader(String label)
	{
		super(label);
		componentslist = new java.util.ArrayList<ymlComponents.YMLComponent>();
	}

	public void addToComponentsList(YMLComponent component){
		componentslist.add(component);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void PrintDebug() {
		System.out.println("HEADER: " + getName() + ",Size: " + componentslist.size());
	}
}
