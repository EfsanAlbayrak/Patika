import java.util.Scanner;
// Java ile girilen sayının harmonik serisini bulan program
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("n sayısı: ");
        //kullanıcıdan veri alınması
        int n = input.nextInt();
        double sum = 0;
        //harmınik serinin bulunması
        for (double i = 1; i <= n; i++) {
            sum += (1.0/i);
        }
        System.out.println("Harmonik toplam: " + sum);
    }
}