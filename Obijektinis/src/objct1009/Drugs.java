package objct1009;

public class Drugs extends Goods {
	
	public Drugs(String name) {
		super(name);
	}
	public double taxedPrice(double basePrice) {
		this.taxedPrice=basePrice*1.05;
		return this.taxedPrice;
	}
	public String getDrugs() {
		return this.name;
	}
}
