package objct1008;

public class Goods {
	protected String item;
	protected String type;
	protected double price;
	protected double tax;
	public Item(String item) {
		this.item = item;
	}
	public double price() {
		return this.price;
	}
	public String getName() {
		return this.item;
	}
}
