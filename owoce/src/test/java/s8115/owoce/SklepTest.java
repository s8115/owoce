package s8115.owoce;

import org.junit.Assert;
import org.junit.Test;

public class SklepTest {

	/**
	 * Moj pierwszy test.
	 */
	@Test
	public void testKupJablko() {

		// przygotowanie
		Sklep sklep = new Sklep();

		// wykonanie
		Jablka jablko = sklep.kupJablko(2);

		// sprawdzenie
		Assert.assertEquals("Jablka", jablko.getRodzaj());
		Assert.assertEquals(2, jablko.getKilogram());
	}

	public void testKupBanan() {
		
		Sklep sklep = new Sklep();

		Banany banan = sklep.kupBanan(4);

		Assert.assertEquals("Banany", banan.getRodzaj());
		Assert.assertEquals(4, banan.getKilogram());
	}

}
