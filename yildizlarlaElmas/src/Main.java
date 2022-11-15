import java.util.Scanner;
//Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
public class Main {
    public static void main(String[] args) {
        //değişken tanımlanması
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= (num - i); k++) {
                //boşluk oluşturulması
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                //yıldız oluşturulması
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= num; i++) {

            for (int k = 1; k <= i; k++) {
                //boşluk oluşturulması
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * num - (2 * i + 1)); j++) {
                //yıldız oluşturulması
                System.out.print("*");
            }

            System.out.println();
        }
    }
}