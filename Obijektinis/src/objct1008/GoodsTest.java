package objct1008;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GoodsTest {

	@Test
	public void itemsShouldHaveName() {
		Item goods= new Item("Media");
		Item goods1= new Item("Goods");
		Item goods2= new Item("Drugs");
		
        assertEquals("Media", goods.getName());
        assertEquals("Drugs", goods2.getName());
        assertEquals("Goods", goods1.getName());
	}
	@Test
	public void goodsShouldHavePriceAndTax() {
		Item goods= new Item("Media");
	}

}
