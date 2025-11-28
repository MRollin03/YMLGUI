package ymlComponents;

public class YMLMISSES  extends YMLComponent{

	private String value;
	private String colon;

	public YMLMISSES(String label, String colon, String value, String trailComment){
		super(label, trailComment);
		this.value = value;
		this.colon = colon;
	}

	public YMLMISSES(String label, String colon, String value){
		super(label, null);
		this.value = value;
		this.colon = colon;
	}

	@Override
	public void PrintDebug() {
			System.out.println(toString());
	}

	@Override
	public String toString() {
		return "MISS!!: " + getName() + ", Colon " + getColon() + ", value: " + value;
	}

	@Override
	public String getName() {
		return super.getName();
	}

	public String getValue() {
		return value;
	}

	public String getColon() {
		return colon;
	}
}
