package test.drive;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringToCharTest {

	@Test
	void checkChar() {
		assertEquals("T", stringToChar.changeStringToCharArray("Tomas"));
	}

}