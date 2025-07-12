
import java.util.Scanner;

public class dizi {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		int[] sayilar=new int[8];
	    for(int i=0;i<sayilar.length;i++) {
	    	System.out.print("dizi["+i+"]:");
	        sayilar[i]=giris.nextInt();
	    }
	    for(int i=0;i<sayilar.length;i++) {
	    	System.out.print(sayilar[i]+" ");
	    }
		


	}

}
