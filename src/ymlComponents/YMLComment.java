package ymlComponents;

public class YMLComment extends YMLComponent{

	public String comment;

	public YMLComment(String name) {
		super(name);
		this.comment = name;
	}

	@Override
	public String toString() {
		return "COMMENT: "+ getComment();
	}

	@Override
	public void PrintDebug() {
		System.out.print(toString());;
	}

	public String getComment() {
		return comment;
	}
}
