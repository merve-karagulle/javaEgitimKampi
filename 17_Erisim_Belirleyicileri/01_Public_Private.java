package erisim;

public class erisim {
	
	/*
	 * erisim belirleyicileri 3 tanedir:
	 * 1-public:Her yerden erişilebilir,kısıtlama yok.
	 * 2-private:Sadece bulunduğu class içerisinden erişilebilir.
	 * 3-Protected:Bulunduğu class ve türetilmiş sınıflardan erişilir.
	 * 1 ve 2 nolu erişim belirleyicileri inceleyeceğiz.
	 */
	 
	public int id;
	public String isim;
	public String soyisim;
	private String cinsiyet;
	
	public erisim() {
		System.out.println("Constructota ulaşıldı.");
	}
	
	public erisim(String cinsiyet) {
		this.cinsiyet=cinsiyet;
		System.out.println("Cinsiyet:"+this.cinsiyet);
	}

}
