package be.pxl.ja.h9_multithreading.synchronisatie;

public class Koekjesdoos {

	private int aantalKoekjes;

	public Koekjesdoos(int aantalKoekjes) {
		this.aantalKoekjes = aantalKoekjes;
	}

	public boolean neemKoekje() {
			if (aantalKoekjes > 0) {
				aantalKoekjes--;
				return true;
			}
			return false;
	}
}
