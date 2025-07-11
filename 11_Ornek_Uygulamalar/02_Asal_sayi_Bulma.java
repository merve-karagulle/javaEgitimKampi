import java.util.Scanner;
public class ornek2 {

	public static void main(String[] args) {
	     //Kendisi ve 1 den başka hiçbir sayıya bölünemeyen sayıya Asal sayı denir
         int sayi;
         boolean asalMi=true;
         Scanner giris=new Scanner(System.in);
         System.out.print("Hangi sayının asal olup olmadığını kontrol etmek istiyorsunuz?:");
         sayi=giris.nextInt();
         for(int i=2;i<=sayi/2;i++) { //Hiçbir sayı kendisinin yarısından fazlasına bölünemez.
        	 if(sayi%i==0) {
        		asalMi=false;
        		 break;
        	 }
        	 
         }
         if(asalMi==true) {
        	 System.out.println(sayi+" asaldır.");
         }else {
        	 System.out.println(sayi+" asal değildir.");
         }
         
	}

}
