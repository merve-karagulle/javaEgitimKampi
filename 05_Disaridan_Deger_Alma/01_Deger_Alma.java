import java.util.Scanner;

public class degerAlma {
	public static void main(String[] args) {
		/*
		 * Kullanıcıdan değer nasıl alınır? 
		 * Bu işlem için Scanner sınıfı kullanılır.Bu sınıfı dahil etmek için java.util.Scanner kütüphanesi import(dahil) edilir.
		 * import java.util.Scanner; şeklinde yazılmaktadır.Daha sonrasında bu Scanner sınıfına ait nesne oluşturulmalıdır. Daha sonrasında da kullanıcıdan giriş alınır.
		 * Scanner:Bu, oluşturmak istediğimiz sınıfın adıdır. Burada Scanner sınıfından bir nesne oluşturmak istiyoruz. 
		 * giris: Bu, oluşturduğumuz nesnenin adıdır. Bu ismi sen belirlersin, klavye, okuyucu, scanner, girilenDegerler gibi başka isimler de olabilir.
		 * new Scanner(System.in):Bu kısım, nesneyi bellekte oluşturur ve başlangıç değeri verir. 
		 * new:Java’da yeni bir nesne oluşturmak için kullanılır. 
		 * Scanner(...): Scanner sınıfının yapıcı metodu(constructor) çağrılır. 
		 * System.in: Klavyeden giriş yapılacağını belirtir.Yani Scanner bu durumda klavyeden veri okuyacaktır.
		 */
		Scanner giris = new Scanner(System.in);
		System.out.print("Adınız Giriniz:");
		String isim = giris.nextLine();
		// Girilen stringi tut,satırı oku ve isim değişkenine ata.
		System.out.println("ADINIZ:"+isim);

		System.out.print("Soyadınızı Giriniz:");
		String soyisim = giris.nextLine();
		System.out.println("SOYADINIZ:"+soyisim);
		
		/*
		 * nextInt() Tam sayı (int) okur 
		 * nextDouble() Ondalıklı sayı (double) okur
		 * next() Tek kelimelik string okur
		 * nextLine() Satır (boşluk dahil) okur
		 * nextBoolean() true/false değeri okur
		 */
		
		System.out.print("Lütfen yaşınızı giriniz:");
		int yas = giris.nextInt();
		System.out.println("YAŞINIZ:" + yas);

		System.out.println("Girdiğiniz bilgileri kontrol ediniz!");
		System.out.print("Girdiğiniz bilgiler doğru mu yanlış mı?:");
		boolean sonuc = giris.nextBoolean();
		System.out.println("Girdiğiniz bilgiler:" + sonuc);
		
		System.out.print("Kilonuzu Giriniz:");
		double kilo=giris.nextDouble();
       System.out.println("KİLONUZ:"+kilo);
       
       //Double girişlerinde virgül ile yazın,ekrana çıktı nokta ile olur .
       //23,3->23.3
	}
}
