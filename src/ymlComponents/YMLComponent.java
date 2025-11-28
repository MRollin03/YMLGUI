package ymlComponents;

public abstract class YMLComponent extends Object{

	//TODO ADD TRAILING COMMENTS
	private  String name;
	private String trailingComment;

	public YMLComponent(String name, String trailingComment){
		this.name = name;this.trailingComment = trailingComment;

	}

	public void PrintDebug(){
		System.out.println("Component Missing PrintDebug Statement!");
	}

	public String getName() {
		return name;
	}
}
