package classlaragiris;

import com.mervekaragulle.Ogrenci;
//Ogrenci.java olan package import edildi.

public class Test {

	public static void main(String[] args) {
		// Ogrenci classına erişebilmek için nesne oluşturalım:
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.id = 44;
		ogrenci.isim = "Merve";
		ogrenci.soyisim = "Karagülle";
		System.out.println("Öğrenci No:"+ogrenci.id);
		System.out.println("Öğrenci İsmi:"+ogrenci.isim);
		System.out.println("Öğrenci Soyismi:"+ogrenci.soyisim);
	}

}
