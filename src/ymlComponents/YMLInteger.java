package ymlComponents;

public class YMLInteger extends ymlComponents.YMLComponent {

	private int value;

	public YMLInteger(String name, Integer value){
		super(name, null);
		this.value = value;

	}

	public YMLInteger(String name, Integer value, String trailingCommnet){
		super(name, trailingCommnet);
		this.value = value;

	}

	@Override
	public void PrintDebug() {
		System.out.println("INTEGERCOMPONENT: " + getName() + " ,value: " + value);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	public int getValue() {
		return value;
	}
}
