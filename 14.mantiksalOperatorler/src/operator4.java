
public class operator4 {

	public static void main(String[] args) {
		// &&(ve,and) operatörü-ikisi de doğru olmalı
		//||(veya,or) operatörü-biri doğru olması yeterli
		//! (değili,not) operatörü-0 ise 1,1 ise 0 yapar.
		//?: üçlü operatör
		
		boolean a=!true;
		System.out.println(a);
		//ekrana false yazar.
		
		 int sayi1;
		 int sayi2;
		 sayi1=23; sayi2=44;
		 boolean sonuc=!(sayi1<sayi2)&&(sayi1>0);
		 System.out.println(sonuc);
		 //sonuc aslında true idi, değili alındı, çıktı false oldu.
		 
		 boolean sonuc2=sayi1>10 && sayi2<50;
		 System.out.println(sonuc2);
		 
		 boolean sonuc3=sayi1>45 || sayi2>10;
		 System.out.println(sonuc3);
		 //En az bir koşul doğru olduğunda true(1) olur.
		 
		 String sonuc4=sayi1>10?"10 dan büyük ":" 10 dan küçük";
		 System.out.println(sonuc4);
		 //sayi1 10 dan büyük mü ? evet->1.kısım alınır,hayır->2.kısım alınır.
		 
		 
		 
		 
	}

}
