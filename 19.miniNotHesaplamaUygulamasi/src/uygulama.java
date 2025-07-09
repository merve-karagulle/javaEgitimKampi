import java.util.Scanner;

public class uygulama {
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
}
