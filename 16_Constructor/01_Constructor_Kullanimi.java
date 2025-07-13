package constructor;

public class test {
     public static void main(String[] args) {
    	 
    	 //Parametresiz constructora ait nesne oluşturuldu. 
    	 ogrenci ogrenci=new ogrenci();
    	 
    	 //Parametreli constructora ait nesne oluşturduk.
    	 ogrenci ogrenci2=new ogrenci(44,"merve","karagulle");
    	 System.out.println("öğrenci No:"+ogrenci2.id);
    	 System.out.println("Öğrenci Adı:"+ogrenci2.isim);
    	 System.out.println("Öğrenci Soyadı:"+ogrenci2.soyisim);
     }
}
