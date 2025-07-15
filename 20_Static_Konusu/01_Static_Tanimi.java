package staticc;

public class ogrenci {

	/*
	 * static anahtar kelimesi nesne tabanlı değil,sınıf tabanlı olmaya yarayan
	 * kelimedir. static değişkene,methoda herhangi bir nesne oluşturmadan sınıf
	 * üzerinden erişilebilir. static method içerisinde static olmayan hiçbir şey
	 * kullanılmaz,tam tersi mümkündür. static değişken nesneden bağımsız olduğu
	 * için bir sınıfa ait bütün nesneler üzerinden aynı değere ulaşılabilir.
	 */

	private int numara;
	private String isim;
	private String soyisim;
	public Long yas;
	public static String ders;

	public static void dersYazdir() {
		System.out.println("En Sevdiği Ders:" + ders);
	}

	public int getNumara() {
		return numara;
	}

	public void setNumara(int numara) {
		this.numara = numara;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

}
