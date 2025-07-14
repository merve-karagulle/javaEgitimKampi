package uygulama;

public class test {
	public static void main(String[] args) {
		kapsulleme kapsul=new kapsulleme();
		kapsul.setMaas(2342);
		System.out.println("Maaş:"+kapsul.getMaas());
		kapsul.setCinsiyet("xbslkxbls");
		System.out.println("Cinsiyet:"+kapsul.getCinsiyet());
		kapsul.setCinsiyet("kadın");
		System.out.println("Cinsiyet:"+kapsul.getCinsiyet());
	}

}
