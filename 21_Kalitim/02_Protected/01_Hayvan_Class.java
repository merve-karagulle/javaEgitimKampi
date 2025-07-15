package kalitim;

public class hayvan {
	/* protected erişim belirleyicisi ile bir değişken hem bulunduğu sınıftan hem
	 de türetilmiş sınıftan ulaşılabilir olur.Ancak dışarıdan erişilemez.*/

	public int yas;
	public String renk;
	public String hayvanIsmi;
	protected int ayakSayisi;

	public void nefesAl() {
		System.out.println("hayvan nefes alıyor...");
	}

}
