
public class continueDeyimi {

	public static void main(String[] args) {
		
		/*
		 * Java'da continue ifadesi, bir döngüde mevcut turu atlayıp bir sonraki tura geçmek için kullanılır. 
		 * break döngüyü tamamen sonlandırırken, continue sadece o adımı (iteration) atlar, döngü çalışmaya devam eder.
		 */
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;//Çıktıda 5 sayısı yoktur.5 değeri geldiğinde yazdırma komutu atlanıyor.
			}
           System.out.print(i+" ");
		
	}
	}
}
