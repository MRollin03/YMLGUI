package ymlComponents;

public abstract class YMLComponent extends Object{

	private  String name;

	public YMLComponent(String name){
		this.name = name;
	}

	public void PrintDebug(){
		System.out.println("Component Missing PrintDebug Statement!");
	}

	public String getName() {
		return name;
	}
}
