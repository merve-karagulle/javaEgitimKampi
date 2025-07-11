
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

		int ciftToplam = 0;
		int tekToplam = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				ciftToplam += i;
			} else {
				System.out.print(i + " ");
				tekToplam += i;
			}
		}
		System.out.println("\n1 den 10 a kadar çift sayıların toplamı:" + ciftToplam);
		System.out.println("1 den 10 a kadar tek sayıların toplamı:" + tekToplam);

		System.out.println("\n-----------\n");
		for (int j = 1; j <= 6; j++) {
			if (j % 2 == 0) {
				System.out.println("Merve");
			} else {
				System.out.println(j);
			}
		}
	}
}
