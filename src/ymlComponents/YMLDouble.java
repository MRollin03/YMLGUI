package ymlComponents;

public class YMLDouble extends ymlComponents.YMLComponent {

	private Double value;

	public YMLDouble(String name, Double value){
		super(name, null);
		this.value = value;

	}
	public YMLDouble(String name, Double value, String trailingComment){
		super(name, trailingComment);
		this.value = value;

	}

	@Override
	public void PrintDebug() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "DOUBLECOMPONENT: " + getName() + " ,value: " + value;
	}

	@Override
	public String getName() {
		return super.getName();
	}

	public Double getValue() {
		return value;
	}
}
