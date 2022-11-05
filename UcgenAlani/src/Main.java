import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Gerekli değişkenlerin tanımlanması
        int kenar1, kenar2, kenar3;
        double alan, cevre, u;

        Scanner input = new Scanner(System.in);

        //üçgenin kenarlarının kullanıcıdan alınması
        System.out.print("Kenar1: ");
        kenar1 = input.nextInt();
        System.out.print("Kenar2: ");
        kenar2 = input.nextInt();
        System.out.print("Kenar3: ");
        kenar3 = input.nextInt();


        //hipotenüs hesaplanması
        u = (kenar1 + kenar2 + kenar3) / 2;

        //üçgenin alanının hesabı
        alan = Math.sqrt(u * (u-kenar1) * (u-kenar2) * (u-kenar3));
        System.out.println("Üçgenin alanı: " + alan);

        //üçgenin çevresinin hesabı
        cevre = kenar1 + kenar2 + kenar3;
        System.out.println("Üçgenin çevresi: " + cevre);
    }
}