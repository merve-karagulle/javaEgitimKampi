
public class ornek {

	public static void main(String[] args) {
		        // 1 den 10 a kadar çift sayıları yazdır.
				// 1 den 10 a kadar tek sayıları yazdır.
				// 1 den 10 a kadar çift sayıların toplamını yazdır.
				// 1 den 10 a kadar tek sayıların toplamını yazdır.

				/*
				 * 1
				 * Merve 
				 * 3 
				 * Merve 
				 * 5 
				 * Merve yazdıran program.
				 */
 
				int i=1;
				int j=1;
				int ciftToplam=0;
				int tekToplam=0;
				while(i<=10) {
					
					if(i%2==0) {
						ciftToplam+=i;
					}else {
						tekToplam+=i;
					}
					i++;
				}
				
				System.out.println("1 den 10 a kadar çift sayıların toplamı:"+ciftToplam);
				System.out.println("1 den 10 a kadar tek sayıların toplamı:"+tekToplam);
				
				System.out.println("\n---------\n");
				while(j<=6) {
					if(j%2==0) {
						System.out.println("Merve");
					}else {
						System.out.println(j);
					}
					j++;
				}
				
	}

}
