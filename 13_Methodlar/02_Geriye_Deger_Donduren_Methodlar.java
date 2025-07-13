package method;

public class method2 {

	public static void main(String[] args) {


		System.out.println("Hedef Sayımız:"+hedefSayi());
        System.out.println("Sayıların Toplamı:"+toplama(4,5));
	}
	
	//Parametresiz ve geriye değer döndüren method tanımı
	public static int hedefSayi() {
		return 34;  //return ifadesi geriye döndürülecek değeri verir.
	}
	//Parametreli ve geriye değer döndüren method tanımı
	public static int toplama(int a,int b) {
	return a+b;
	}

}
