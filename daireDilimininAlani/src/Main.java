import java.util.Scanner;
/*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program.*/

public class Main {
    public static void main(String[] args) {
        //Gerekli değişkenlerin tanımlanması
        int r;
        double cevre, alan, pi = 3.14, alfa;

        //Kullanıcıdan yarıçap bilgisinin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapı: ");
        r = input.nextInt();

        System.out.print("alfa açısı: ");
        alfa = input.nextInt();

        //Dairenin çevre ve alanının hesaplanması
        alan = (pi * (r*r) * alfa) / 360;

        System.out.print("Daire diliminin Alanı: " + alan);

    }
}