package ymlComponents;

public class YMLInteger extends ymlComponents.YMLComponent {

	private int value;

	public YMLInteger(String name, Integer value){
		super(name);
		this.value = value;

	}

	@Override
	public void PrintDebug() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "INTEGERCOMPONENT: " + getName() + " ,value: " + value;
	}

	@Override
	public String getName() {
		return super.getName();
	}

	public int getValue() {
		return value;
	}
}
