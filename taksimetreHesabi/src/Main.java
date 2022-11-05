import java.util.Scanner;
        /* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
            Taksimetre KM başına 2.20 TL tutmaktadır.
            Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
            Taksimetre açılış ücreti 10 TL'dir.  */

public class Main {
    public static void main(String[] args) {
        //değişkenlerin tanımlanması
        double km;
        double kmBasi = 2.20, baslangic = 10, total;

        //kullanıcıdan km bilgisinin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("KM: ");
        km = input.nextDouble();

        //taksimetre tutarının hesaplanması
        total = (km * kmBasi) + baslangic;

        total = (total < 20) ? 20 : total;

        System.out.print("Taksimetre tutarı: " + total);
    }
}