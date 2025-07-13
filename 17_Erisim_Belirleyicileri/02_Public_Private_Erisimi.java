package erisim;


public class test {

	public static void main(String[] args) {
	   
		erisim erisim=new erisim();
		
		erisim erisim2=new erisim("Kadın");
		erisim2.id=44;
		erisim2.isim="Merve";
		erisim2.soyisim="Karagülle";
		System.out.println("Öğrenci Id:"+erisim2.id);
		System.out.println("Öğrenci İsmi:"+erisim2.isim);
		System.out.println("Öğrenci Soyismi:"+erisim2.soyisim);
		
	}

}
