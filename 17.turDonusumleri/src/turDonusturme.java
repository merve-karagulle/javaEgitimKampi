
public class turDonusturme {

	public static void main(String[] args) {
		//String tipinden int tipine dönüştürmek için iki method kullanılır.
		String a="10";
		int b=Integer.valueOf(a);
		System.out.println(b+15);
		int c=Integer.parseInt(a);
		System.out.println(c+25);
		
		//İnt tipinden string tipine dönüştürmek için yine valueOf kullanılır.
		int yas=23;
		String yasim=String.valueOf(yas);
		System.out.println(yasim+" Yaşındayım.");
		
		//Double tipinden int tipine dönüştürme (int) ile yapılır.Virgülden sonraki kısım atılır.
		double kilo=81.34;
		int tamKilo=(int)kilo;
		System.out.println(tamKilo);
		
		//İnt tipinden double tipine de aynı şekilde dönüştürülür.İnt olan 5 double da 5.0 olur.
		int sayi=9;
		double ondalikliSayi=(double)sayi;
		System.out.println(ondalikliSayi);
		
		//Float tipinden long veri tipine dönüştürme de aynı şekilde olur.
		float sayi2=6.7f;
		long longSayi=(long)sayi2;
		System.out.println(longSayi);
		
		//Long tipinden floata dönüştürelim
		long sayi3=45;
		float floatSayi=(float)sayi3;
		System.out.println(floatSayi);
		
		//Long tipinden stringe çevirme valueOf kullanılır.
		long sayi4=34;
		String yas2=String.valueOf(sayi4);
		System.out.println(yas2+45);
		
		//Float tipinden stringe de aynı şekilde valueOf ile çevrilir.
		float sayi5=45.5f;
		String kilo2=String.valueOf(sayi5);
		System.out.println(kilo2+3.4);
		
		//Byte tipinden stringe Byte sınıfına ait toString metodu kullanılır.
		byte sayi6=45;
		String sayim=Byte.toString(sayi6);
		System.out.println(sayim+56);
		
		
		
		

	}

}
