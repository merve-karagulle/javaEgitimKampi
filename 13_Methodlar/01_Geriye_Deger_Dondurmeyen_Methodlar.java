package method;

public class method {
      public static void main(String[] args) {
    	  
      
    	  /*
    	   * Java'da methodlar (yöntemler), belirli bir görevi gerçekleştiren kod bloklarıdır. 
    	   * Kodun tekrar kullanılabilirliğini sağlar ve programı daha düzenli hale getirir.
    	    */
    	
    	 isimYazdir();
         yildizBastir(10);
    
    	  }
      
      //Parametresiz geriye değer döndürmeyen metot oluşturma 
      public static void isimYazdir() {
    	  System.out.println("Merve");
      }
      
      //Parametreli ve geriye değer döndürmeyen metot oluşturma
      public static void yildizBastir(int i) {
    	  for(int j=1;j<=i;j++) {
    		  System.out.print("*");
    	  }
      }
    	  
}

