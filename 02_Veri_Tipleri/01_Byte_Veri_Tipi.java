public class ByteVeriTipi {
    public static void main(String[] args) {
    	/*
    	 * Byte Veri Tipi Nedir?
    	 *byte veri tipi, Java’da 8 bitlik bir tam sayı tipidir.
         *Değer aralığı: -128 ile 127 arasındadır.
         *Bellekte az yer kaplar, özellikle hafıza kısıtlı durumlarda veya küçük tam sayılarla işlem yaparken tercih edilir.
        */
    	
        // byte tipinde değişken tanımlama
        byte sayi = 100;
        
        System.out.println("Byte veri tipi örneği:");
        System.out.println("Sayı değeri: " + sayi);
        
        // byte aralığını göster
        System.out.println("Byte veri tipi alabileceği en küçük değer: " + Byte.MIN_VALUE);
        System.out.println("Byte veri tipi alabileceği en büyük değer: " + Byte.MAX_VALUE);
        
        // byte tipi sınırlarını aşan değer atanırsa hata olur:
        // byte hata = 130; // hata verir çünkü 130 byte sınırının dışında
        
        // byte değer üzerinde işlem yapabiliriz
        sayi++;
        System.out.println("Sayı 1 arttırıldıktan sonra: " + sayi);
    }
}
