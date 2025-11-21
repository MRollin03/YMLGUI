package ymlComponents;

public class YMLBoolean extends ymlComponents.YMLComponent {

	private Boolean bool;

	public YMLBoolean(String name, Boolean bool) {
		super(name);
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
		System.out.println("BOOLCOMPONENT: " + getName() + " ,value: " + bool.toString());
	}

	public Boolean getBool() {
		return bool;
	}
	public String getName(){
		return super.getName();
	}
}
