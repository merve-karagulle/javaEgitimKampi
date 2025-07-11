
public class breakDeyimi {

	public static void main(String[] args) {
		
		/*
		 * Java’da break ifadesi, döngüyü veya switch yapısını anında sonlandırmak için kullanılır.
		 *  En çok for, while, do-while döngüleri ve switch bloklarında kullanılır.
		 *  İstenilen bir değer bulunduğunda döngü devam etmez.
		 */
		
		int i=0;
        while(++i<=10) {
        	if(i==7) {
        		break;//break gördü ve bulunduğu while döngüsünü sona erdirdi. break=döngüyü kır.
        	}
        	System.out.print(i+" ");
        	
        }
        System.out.println("\n");
        for(int j=1;j<=10;j++) {
        	if(j==6) {
        		break;
        	}
        	System.out.print(j+" ");
        }


	}

}
