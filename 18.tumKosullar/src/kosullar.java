public class kosullar {
    public static void main(String[] args) {
    	
    	  /*
        if-else yapısı, programda koşullara göre farklı işlemler yapmamızı sağlar.

        - if (koşul): Koşul doğruysa (true) içindeki kod bloğu çalışır.
        - else: if koşulu yanlışsa (false) çalışacak kod bloğunu belirtir.
        - else if: Birden fazla koşulu sırayla kontrol etmek için kullanılır.

       */

        int sayi = 10;  // Kontrol edeceğimiz sayı

        // Eğer sayı 0'dan büyükse
        if (sayi > 0) {
            System.out.println("Sayı pozitif.");  // Bu satır koşul doğruysa çalışır
        }
        // Eğer sayı 0'a eşitse
        else if (sayi == 0) {
            System.out.println("Sayı sıfır.");  // Bu satır ikinci koşul doğruysa çalışır
        }
        // Yukarıdaki koşulların hiçbiri doğru değilse (yani sayı negatifse)
        else {
            System.out.println("Sayı negatif.");  // Bu satır diğer tüm durumlarda çalışır
        }
    }
  

}
