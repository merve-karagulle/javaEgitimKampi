package uygulama;

public class uygulama {
	// Bir şirketin çalışanlarına ait bir class oluşturacağız.

	public String isim;
	public String soyisim;
	public String pozisyon;
	public int yas;
	public int deneyim;

	private int maas;
	private String tcNo;

	public uygulama(String isim, String soyisim, String pozisyon, int yas, int deneyim, int maas, String tcNo) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.pozisyon = pozisyon;
		this.yas = yas;
		this.deneyim = deneyim;
		this.maas = maas;
		this.tcNo = tcNo;
	}

	public uygulama(int maas, String tcNo) {
		this.maas = maas;
		this.tcNo = tcNo;
     System.out.println(tcNo+" TC'Li Çalışan "+this.maas+" maaşına çalışıyor.Diğer Bilgilerine bakalım:) ");
	}

	

}
