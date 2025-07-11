
public class ifElseKosulu {

	public static void main(String[] args) {
		
      // if-else koşulu : Koşul doğru ise if bloğu,yanlış ise else bloğu çalışır.
	  //if-else if-else koşulu:Çoklu durumlarda ise,değil,değilse .. şeklinde çalışır.
		
		int sayi1=5;
		int sayi2=3;
		if(sayi1>sayi2) {
			System.out.println("sayi1 sayi2 den büyüktür.");
		} else {
			System.out.println("sayi2 sayi1 den büyüktür.");
		}
		
		if(sayi1==sayi2) {
			System.out.println("Sayılar eşittir.");
		}else {
			System.out.println("Sayılar eşit değildir.");
		}
	}

}
