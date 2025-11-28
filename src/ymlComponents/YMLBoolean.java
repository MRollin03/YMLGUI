package ymlComponents;

public class YMLBoolean extends ymlComponents.YMLComponent {

	private Boolean bool;

	public YMLBoolean(String name, Boolean bool) {
		super(name, null);
		this.bool = bool;
	}

	public YMLBoolean(String name, Boolean bool, String trailingComment) {
		super(name, trailingComment);
		this.bool = bool;
	}

	//GETTERES AND SETTERS
	public Boolean isTrue() {
		return bool;
	}

	public void setBool(Boolean bool) {
		this.bool = bool;
	}


	@Override
	public void PrintDebug() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "BOOLEAN: "+ getName() + ", value: " + getBool();
	}


	public Boolean getBool() {
		return bool;
	}
	public String getName(){
		return super.getName();
	}
}
