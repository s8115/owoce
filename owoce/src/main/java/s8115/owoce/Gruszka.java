package s8115.owoce;

public class Gruszka extends Owoce {
	@Override
	public String getRodzaj() {
		return "Gruszka";
	}

	public Gruszka(int kilogramy) { // konstruktor
		kilogram = kilogramy;
	}

}
