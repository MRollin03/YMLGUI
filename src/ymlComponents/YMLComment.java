package ymlComponents;

public class YMLComment extends YMLComponent{

	public String comment;

	public YMLComment(String name) {
		super(name, null);
		this.comment = name;
	}

	@Override
	public void PrintDebug() {
		System.out.println("COMMENT:");
	}
}
