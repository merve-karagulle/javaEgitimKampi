import java.util.Scanner;

public class uygulama {
<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notunu giriniz: ");
        int vize = scanner.nextInt();

        System.out.print("Final notunu giriniz: ");
        int finalNotu = scanner.nextInt();

        // Not ortalaması: %40 vize + %60 final
        double ortalama = vize * 0.4 + finalNotu * 0.6;

        // Geçme notu 50
        if (ortalama >= 50) {
            System.out.println("Tebrikler, dersten geçtiniz. Ortalama: " + ortalama);
        } else {
            System.out.println("Maalesef, dersten kaldınız. Ortalama: " + ortalama);
        }

        scanner.close();
    }
=======

	public static void main(String[] args) {
		/*
		 * Öğrenciye ait ad-soyad-vize notu-final notu'nu kullanıcıdan alan ve geçme
		 * kalma durumunu geçme kalma notunu hesaplayan java dilinde program:
		 * string iism;
		 */
		String isim;
		String soyisim;
		double vizeNot;
		double finalNot;
		Scanner giris=new Scanner(System.in);
		System.out.println("Not Hesaplama Uygulamamıza Hoşgeldiniz:)");
		System.out.print("Lütfen adınızı giriniz:");
		isim=giris.nextLine();
		System.out.println("Adınız:"+isim);
		System.out.print("Lütfen soyadınızı giriniz:");
		soyisim=giris.nextLine();
		System.out.println("Soyadınız:"+soyisim);
		System.out.print("Lütfen vize notunuzu giriniz:");
		vizeNot=giris.nextDouble();
		System.out.println("Vize notunuz:"+vizeNot);
		System.out.print("Lütfen vize notunuzu giriniz:");
		finalNot=giris.nextDouble();
		System.out.println("Final notunuz:"+finalNot);
		System.out.println("Geçme-Kalma durumunuz:");
		double genelNot=(vizeNot*0.4)+(finalNot*0.6);
		if(genelNot>=50) {
			System.out.println("Geçtiniz.Notunuz:"+genelNot);
		}else {
			System.out.println("Kaldınız.Notunuz:"+genelNot);
		}
		
		
		
		
		

	}

>>>>>>> 09a0158 (Projeler eklendi)
}
