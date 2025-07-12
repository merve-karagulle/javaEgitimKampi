
public class diziler {
        public static void main(String[] args) {
        	
        	//Diziler aynı veri tipine sahip binlerce verinin tek bir yerde tutulmasını sağlayan yapıdır.
        	//Dizi oluşturma-Değer atama-Dizi yazdırma
        	
        	 String[] isimDizisi= {"merve","mustafa","mert","mercan"};
        	 int uzunluk=isimDizisi.length;
        	 for(int i=0;i<uzunluk;i++) {
        		 System.out.println(isimDizisi[i]);
        		 
        	 }
        	 
        	// int[] sayilar= {2,4,5,6,7};
        	 int[] sayilar=new int[6]; 
        	 sayilar[0]=45;
        	 sayilar[1]=47;
        	 sayilar[2]=56;
        	 sayilar[3]=77;
        	 sayilar[4]=78;
        	 sayilar[5]=68;
        	 for(int i=0;i<sayilar.length;i++) {
        		 System.out.println(sayilar[i]);
        	 }
        	 
        	 char[] karakterDizi= {'a','b','c'};
        	 for(int i=0;i<karakterDizi.length;i++) {
        		 System.out.println(karakterDizi[i]);
        	 }
        	 
        	 double[] doubleSayi= {3.4,5.6,45.7};
        	 for(int i=0;i<doubleSayi.length;i++) {
        		 System.out.println(doubleSayi[i]);
        	 }
        }
}
