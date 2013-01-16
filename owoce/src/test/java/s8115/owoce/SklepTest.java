package s8115.owoce;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SklepTest {

	private Sklep sklep;

	@Before
	public void init() {
		sklep = new Sklep();
	}

	/**
	 * Moj pierwszy test.
	 */
	@Test
	public void testKupJablko() {

		// wykonanie
		Jablka jablko = sklep.kupJablko(2);

		// sprawdzenie
		Assert.assertEquals("Jablka", jablko.getRodzaj());
		Assert.assertEquals(2, jablko.getKilogram());
	}

	@Test
	public void testKupBanan() {

		Banany banan = sklep.kupBanan(4);

		Assert.assertEquals("Banany", banan.getRodzaj());
		Assert.assertEquals(4, banan.getKilogram());
	}

	@Test
	public void testKupGruszka() {

		Gruszka gruszka = sklep.kupGruszka(4);

		Assert.assertEquals("Gruszka", gruszka.getRodzaj());
		Assert.assertEquals(4, gruszka.getKilogram());
	}

	@Test
	public void testKupMalina() {

		Malina malina = sklep.kupMalina(4);

		Assert.assertEquals("Malina", malina.getRodzaj());
		Assert.assertEquals(4, malina.getKilogram());
	}

}
