package kalitim;

public class test {
	public static void main(String[] args) {
		kopek kopek = new kopek();
		kopek.ayakSayisi = 4;
		kopek.hayvanIsmi = "Köpek";
		kopek.renk = "siyah";
		kopek.yas = 45;
		System.out.println("Ayak sayısı:" + kopek.ayakSayisi);
		System.out.println("Hayvan İsmi:" + kopek.hayvanIsmi);
		System.out.println("Hayvan Rengi:" + kopek.renk);
		System.out.println("Hayvan Yaşı:" + kopek.yas);
		kopek.nefesAl();
		// protected değişkenine erişelim.ayakSayisi protected değişkendir.
		kopek.protectedEris();

	}

}
