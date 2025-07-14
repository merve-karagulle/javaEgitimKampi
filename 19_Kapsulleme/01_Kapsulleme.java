package uygulama;

public class kapsulleme {

	private int maas;
	private String cinsiyet;

	/*
	 * Kapsülleme,private değişkenleri oluşturarak direkt erişimi engellemek,saçma
	 * değerler atamayı önler. Bu durum için 
	 * 1-constructor
	 * 2-getter,setter(kapsülleme) kullanılır. 2.durum tavsiye edilir.Oluşturalım:
	 */

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		if(cinsiyet.equals("kadın")||cinsiyet.equals("erkek"))
		{
			this.cinsiyet = cinsiyet;	
		}else {
			System.out.println("Geçersiz cinsiyet!!");
		}
		
	}

	/*
	 * 1-private ile değişkeni gizledik. 2-set ile değişkene değer atadık. 3-get ile
	 * değeri görüntüledik.
	 */

}
