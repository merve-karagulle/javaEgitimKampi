import java.util.Scanner;
public class uygulama2 {

	public static void main(String[] args) {
         /*
          * Bir kuruyemişci bir toptancıdan ;
          * 12 kilo leblebiyi kilosunu 3.5 TL-5.5 TL,
          * 28 kilo fındığın kilosunu 45 TL-55 TL,
          * 34 kilo kajunun kilosunu 90 TL-110 TL,
          * 56 kilo fıstığın kilosunu 65 TL- 167 TL,
          * 23 kilo bademin kilosunu 32 TL-67 TL' den almış,satmıştır.
          * Bu kuruyemişci satabildiği kadar kuruyemişi satıp kirasını ödemek istemektedir.
          * Bunu hesaplamak ,için de java dilinde bir program:
          */
		Scanner giris= new Scanner(System.in);
		double leblebiKilo;
		double findikKilo;
		double kajuKilo;
		double fistikKilo;
		double bademKilo;
		double satis;
		double alis;
		double kazanilanPara;
		double kira=13768;
        System.out.print("Kaç kilo leblebi satıldı?:");
        leblebiKilo=giris.nextDouble();
        System.out.print("Kaç kilo fındık satıldı?:");
        findikKilo=giris.nextDouble();
        System.out.print("Kaç kilo kaju satıldı?:");
        kajuKilo=giris.nextDouble();
        System.out.print("Kaç kilo fıstık satıldı?:");
        fistikKilo=giris.nextDouble();
        System.out.print("Kaç kilo badem satıldı?:");
        bademKilo=giris.nextDouble();
        satis=(5.5*leblebiKilo)+(55*findikKilo)+(110*kajuKilo)+(167*fistikKilo)+(67*bademKilo);
        alis=(4.5*leblebiKilo)+(45*findikKilo)+(90*kajuKilo)+(65*fistikKilo)+(32*bademKilo);

        kazanilanPara=satis-alis;
        if(kazanilanPara>=kira) {
        	System.out.println("Bravoooo! Kiranızı ödeyebiliyorsunuz. Kazanılan Para:"+kazanilanPara);
        }else {
        	System.out.println("Maalesef kazanılan para yetersiz. Kazanılan Para:"+kazanilanPara);
        }
        
		
		
		
		
	}

}
