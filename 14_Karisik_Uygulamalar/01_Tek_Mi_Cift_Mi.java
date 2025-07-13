package uygulamam;
import java.util.Scanner;
public class tekMicifrmi {
       public static void main(String[] args) {
    	   System.out.println("TEK Mİ ÇİFT Mİ? UYGULAMAMIZA HOŞGELDİNİZ ");
    	   Scanner giris =new Scanner(System.in);
    	   int elemanSayisi;
    	   System.out.print("Kaç eleman girmek istersiniz?:");
    	   elemanSayisi=giris.nextInt();
    	   int[] sayilar=new int[elemanSayisi];
    	   
    	   for(int i=0;i<elemanSayisi;i++) {
    		   
    		   System.out.print((i+1)+".Sayı:");
    		   sayilar[i]=giris.nextInt();
    		   
    		    }
           for(int i=0;i<elemanSayisi;i++) {
    		   
    		   sayiKontrol(sayilar[i]);
    		   
    		    }
       }
       public static void sayiKontrol(int x) {
    	   if(x%2==0) {
    		   System.out.println(x+" Sayısı Çifttir.");
    	   }
    	   else {
    		   System.out.println(x+ " Sayısı Tektir.");
    	   }
       }
}
