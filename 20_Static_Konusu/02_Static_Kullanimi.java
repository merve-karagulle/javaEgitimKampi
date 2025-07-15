package staticc;

public class kullanim {

	public static void main(String[] args) {
		
		//ogrenci sınıfından bir nesne oluşturmadık,ders değişkenine ulaştık.
		ogrenci.ders="matematik";
		ogrenci.dersYazdir();
		
		//ogrenci sınıfından bir nesne oluşturduk,ders değişkenine bu nesne de ulaşabildi.
		ogrenci ogrenci1=new ogrenci();
		ogrenci1.dersYazdir();
		
		//ogrenci sınıfından ikinci bir  nesne oluşturduk,ders değişkenine bu nesne de ulaşabildi.
		ogrenci ogrenci2=new ogrenci();
		ogrenci2.dersYazdir();
		
		//static olmayan bir değişkende durum böyle değildir.
		ogrenci1.setIsim("merve");
		System.out.println("1.nesnenin isimi:"+ogrenci1.getIsim());
		System.out.println("2.nesnenin ismi:"+ogrenci2.getIsim());
		
		/*
		 * Gördüğünüz gibi 2.nesneye değer atanmadığı ve 
		 * değişken static olmadığı için 2. nesne bu değişkene ulaşamadı.
		 *
		 */
	
		
		
	}

}
