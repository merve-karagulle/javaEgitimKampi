import java.util.Scanner;
public class uygulama {

	public static void main(String[] args) {
		//Merve Karagülle IBAN:TR23 0001 7800 0043 7845 00
		//Hamit Karagülle IBAN:TR26 0501 7856 1046 4545 01
		
		/*
		 * ATM uygulamasında;
		 * Para görüntülemek için 1
		 * Para çekmek için 2
		 * Para yatırmak için 3 tuşuna basılacaktır.
		 */
		
		int islem;
		Scanner giris=new Scanner(System.in);
		System.out.println("ATM'ye HOŞGELDİNİZ");
		System.out.print("Hangi hesap numarası ile işlemlere devam etmek istiyorsunuz?(1-2):");
		int hesap=giris.nextInt();
		if(hesap==1) {
			System.out.println("Merve Karagülle IBAN:TR23 0001 7800 0043 7845 00");
		}
		else if(hesap==2) {
			System.out.println("Hamit Karagülle IBAN:TR26 0501 7856 1046 4545 01");
		}
		double bakiye1=23456.67;
		double bakiye2=25678.45;
		
	
		System.out.print("Yapmak istediğiniz işlemi seçiniz(1-3):");
		islem=giris.nextInt();
		switch(islem) {
		case 1:
			if(hesap==1) {
				System.out.println("Bakiye:"+bakiye1+" TL");
			}
			else if(hesap==2) {
				System.out.println("Bakiye:"+bakiye2+" TL");
			}
			else {
				System.out.println("Geçersiz Hesap No!");
			}
			break;
		case 2:
			System.out.print("Çekmek istediğiniz para miktarını giriniz:");
			double cekilenPara=giris.nextDouble();
			if(hesap==1) {
				if(cekilenPara<=bakiye1) {
					System.out.println(cekilenPara+" Tl Çekiliyor...");
					System.out.println("Paranız Çekildi.Kalan Bakiye:"+(bakiye1-cekilenPara));
				}
				else {
					System.out.println("Bakiye Yetersiz.Bakiye:"+bakiye1);
				}
			}
			else if(hesap==2) {
				if(cekilenPara<=bakiye2) {
					System.out.println(cekilenPara+" Tl Çekiliyor...");
					System.out.println("Paranız Çekildi.Kalan Bakiye:"+(bakiye2-cekilenPara));
				}
				else {
					System.out.println("Bakiye Yetersiz.Bakiye:"+bakiye2);
				}
			}
			break;
		case 3:
		
					if(hesap==1) {
						System.out.print("Yatıracağınız Para miktarını giriniz:");
						double yatirilanPara=giris.nextDouble();
						System.out.println("Güncel Bakiye:"+(yatirilanPara+bakiye1));
					}
					else if(hesap==2) {
						System.out.print("Yatıracağınız Para miktarını giriniz:");
						double yatirilanPara=giris.nextDouble();
						System.out.println("Güncel Bakiye:"+(yatirilanPara+bakiye2));
					}
					else {
						System.out.println("Geçersiz Hesap No!");
					}
			break;
			default:System.out.println("Geçerli işlem seçiniz");
			
		}
		
		
		/*
		 * Burada bir not düşmek istiyorum.== operatörünün görevini üstlenen bir equals metodu bulunmaktadır.
		 * Örneğin bir kullanıcı adı girilecek ise kullaniciAdi.equals("MERVE") yazılabilir.
		 * Primitive Tipler → int, double, boolean, char, vs.
		 * Bunlar equals() kullanmaz, == ile karşılaştırılır.
		 * Nesne Tipler → String, Integer, Double, ArrayList, Scanner, kendi class’ların vs.
		 * Bunlar nesnedir, bu yüzden equals() kullanılır.
		 */
		
		
	}

}
