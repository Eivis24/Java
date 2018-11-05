package objct1009;

public class Press extends Goods {
	public Press(String name) {
		super(name);
	}
	public String getPress() {
		return this.name;
	}
	public double taxedPrice(double basePrice) {
		this.taxedPrice=basePrice*1.09;
		return this.taxedPrice;
	}
}
