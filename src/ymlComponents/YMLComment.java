package ymlComponents;

public class YMLComment extends YMLComponent{

	public String comment;

	public YMLComment(String name) {
		super(name, null);
		this.comment = name;
	}
}
