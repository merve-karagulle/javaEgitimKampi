import java.util.Scanner;
public class haftaninGunleri {

	public static void main(String[] args) {
       //Java'da switch-case yapısı, çoklu koşulları daha sade bir şekilde kontrol etmek için kullanılan bir kontrol yapısıdır. 
		//if-else if-else yapısına alternatiftir.
		//Haftanın günlerini swirch case ile oluşturalım.
		Scanner giris=new Scanner(System.in);
		int gun;
		System.out.print("Gün Sırasını Giriniz:");
		gun=giris.nextInt();
		switch(gun) {
		case 1:
			System.out.println("PAZARTESİ");break;
		case 2:
			System.out.println("SALI");break;
		case 3:
			System.out.println("ÇARŞAMBA");break;
		case 4:
			System.out.println("PERŞEMBE");break;
		case 5:
			System.out.println("CUMA");break;
		case 6:
			System.out.println("CUMARTESİ");break;
		case 7:
			System.out.println("PAZAR");break;
		default:
			System.out.println("GEÇERSİZ GÜN");
			}
		//default değer hiçbir case durumuna uyulmadığında aktif hale gelir.
		//break anahtar sözcüğü switch yapısından çıkmamızı sağlar,kullanılmazsa diğer caseler aktif hale gelir.
	}
}
