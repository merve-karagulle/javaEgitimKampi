package uygulama;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		uygulama calisan = new uygulama("Merve", "Karagulle", "CEO", 20, 3, 200000, "1073562379");
		System.out.println(calisan.isim + " " + calisan.soyisim + "," + calisan.pozisyon + " pozisyonunda "
				+ calisan.deneyim + " yıldır çalışıyor.");
		Scanner giris = new Scanner(System.in);
		uygulama calisan2 = new uygulama(200000, "1092737392");
		System.out.print("İsim girin:");
		calisan2.isim = giris.nextLine();
		System.out.print("Soyisim girin:");
		calisan2.soyisim = giris.nextLine();
		System.out.print("Pozisyon girin:");
		calisan2.pozisyon = giris.nextLine();
		System.out.print("Deneyim girin:");
		calisan2.deneyim = giris.nextInt();
		System.out.print("Yaş girin:");
		calisan2.yas = giris.nextInt();

		System.out.println(calisan2.isim + " " + calisan2.soyisim + "," + calisan2.pozisyon + " pozisyonunda "
				+ calisan2.deneyim + " yıldır çalışıyor.");

	}

}
