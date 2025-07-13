
import java.util.Scanner;
public class dizi {

	public static void main(String[] args) {
		//Dışarıdan bir tamsayı dizisi alacağız, elemanların asal olup olmadığını bulacağız.
		Scanner giris=new Scanner(System.in);
		int[] sayilar=new int[3];
		System.out.println("3 elemanlı dizi elemanlarını giriniz:)");
		for(int i=0;i<sayilar.length;i++) {
			System.out.print("dizi["+i+"]:");
			sayilar[i]=giris.nextInt();
			
			
		}
		int asalAdet=0;
		int asalOlmayanAdet=0;
		for(int i=0;i<sayilar.length;i++) {
			
			boolean asalMi=true;
			for(int j=2;j<sayilar[i]/2;j++) {
				if((sayilar[i]%j)==0) {
					asalMi=false;
					
					break;
				}
				
			}
			if(asalMi==false) {
				System.out.println("Dizinin "+(i+1)+". elemanı asal değildir.");
				asalOlmayanAdet++;
			}else {
				System.out.println("Dizinin "+(i+1)+". elemanı asal sayıdır.");
				asalAdet++;
			}
			
		}
		System.out.println("Toplam asal sayısı:"+asalAdet);
		System.out.println("Toplam asal olmayan Adet:"+asalOlmayanAdet);

	}

}
