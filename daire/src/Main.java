import java.util.Scanner;
/*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program.*/

public class Main {
    public static void main(String[] args) {
        //Gerekli değişkenlerin tanımlanması
        int r;
        double cevre, alan, pi = 3.14;

        //Kullanıcıdan yarıçap bilgisinin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapı: ");
        r = input.nextInt();

        //Dairenin çevre ve alanının hesaplanması
        cevre = 2 * pi * r;
        alan = pi * r * r;

        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.print("Dairenin Alanı: " + alan);

    }
}