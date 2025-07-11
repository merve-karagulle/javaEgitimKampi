
public class operator2 {

	public static void main(String[] args) {
		// + (toplama), - (çıkarma) operatörleridir.
		
		int vize=76;
		int finalNot=98;
		int sonuc= vize+finalNot;
        System.out.println(sonuc);
       
        int vize2=76;
		int finalNot2=98;
		int sonuc2= (vize2+finalNot2)/2;
		System.out.println(sonuc2);
		System.out.println("Dersi Geçme Notunuz:"+sonuc2);
		
		//Bu örnekteki + birleştirme görevinde kullanılır.
		
		String isim="merve";
		String soyisim="karagulle";
		System.out.println("Ad Soyad: "+isim+" "+ soyisim);
        
		// // bölme operatötü: / , çarpma operatörü: *
		
		int sayi1=5;
		int sayi2=19;
		int carpim=sayi1*sayi2;
		System.out.println(carpim);
		int bolum=sayi2/sayi1;
		// bolum değişkeni integer tipinde olduğu için küsuratını almadı.
		System.out.println(bolum);
		
		//işlem öncelikleri aynıdır:-parantez -carpma bolme -toplama çıkarma
		
		int sayi3=(sayi1*sayi2)/5;
		System.out.println(sayi3);
		System.out.println("Çarpım sonucu:"+ carpim+" Bölüm Sonucu:"+bolum+" Diger işlemin sonucu:"+sayi3);
		
		//mod alma operatörü(%) kalan bulmak için kullanılır
	    int sayi4=10;
	    int kalan=sayi4%3;//10 sayısının 3 ile bölümünden kalanı kalan değişkenine aktarır.
	    System.out.println(kalan);
		
		// arttırma:(++) ve azaltma:(--) operatörleri
		sayi3=++sayi3;
		System.out.println(sayi3);
		int a=5;
	    a++;
	    System.out.println(a);
	    a--;
	    a--;
	    System.out.println(a);
	    
	    //bileşik operatörler(-=,+=,/=,*=,%=)
	    
	    int b=90;
	    b+=5; //b sayisina b+5 değerini atadı.b artık 95 oldu.
	    System.out.println(b);
	    b%=5;//b sayısına b nin 5 ile bölümünden kalanını atadık.b 0 oldu.
	    System.out.println(b);
	    
	}

}
