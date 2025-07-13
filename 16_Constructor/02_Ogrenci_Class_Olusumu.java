package constructor;

public class ogrenci {
	public int id;
	public String isim;
	public String soyisim;

	/*
	 * Constructors(Yapıcı fmethod) Javada bir sınıfa ait nesne oluşturduğumuzda
	 * class ismi ile aynı isimde olan baslangıç methodudur. Birden fazla
	 * constructor olabilir.Bu duruma fonksiyon aşırı yüklemesi overloading denir.
	 * Parametre tipi,sayıları farklı olabilir.
	 */
	
	public ogrenci(int id, String isim, String soyisim) {
		this.id = id;
		this.isim = isim;
		this.soyisim = soyisim;
		
		/*
		 * this işaretçisi bu class anlamına gelir. Aynı isimde olan paramöetre ile
		 * karışılmasını önler.
		 */
	}
	public ogrenci() {
		System.out.println("Parametresiz constructora ulaşıldı.");
	}
}
