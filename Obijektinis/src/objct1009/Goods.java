package objct1009;

public class Goods {
	protected String name;
	protected double basePrice;
	protected double taxedPrice;
	
	public Goods(String name) {
		this.name = name;
	}
	public double basePrice() {
		return this.basePrice;
	}
	public double taxedPrice(double basePrice) {
		this.taxedPrice=basePrice*1.21;
		return this.taxedPrice;
	}
	public String getGoods() {
		return this.name;
	}
}
