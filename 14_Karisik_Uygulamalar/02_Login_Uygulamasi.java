package login;
import java.util.Scanner;
public class login {
     public static void main(String[] args) {
    	 
    	 int hak=3;
    	 String sifre="1234";
    	 String tahmin;
    
    	 Scanner giris=new Scanner(System.in);
    	
    	while(hak>0) {
    		 System.out.print("Giriş yapmak için şifrenizi giriniz:");
    		 tahmin=giris.nextLine();
    	if(tahmin.equals(sifre)) { //String değerleri karşılaştırmak için equals methodu kullanılır.
    		System.out.println("hoşgeldiniz:)");
    		break;
    	}else {
    		hak--;
    		System.out.println("Yanlış şifre.Kalan hak:"+hak);
    	}
    	}
    	 
    	 
    	 
    	 
     }
 
     }

     
