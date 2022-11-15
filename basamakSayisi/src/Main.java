import java.util.Scanner;
//Bir sayının basamak sayılarının toplamını hesaplayan program
public class Main {
    public static void main(String[] args) {

        //değişkenlerin tanımlanması
        int number, counter = 0, sum = 0;

        //kullanıcıdan gerekli verilerin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        number = input.nextInt();

        //alınan sayının basamak sayılarının toplanması
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
            counter++;
        }
        System.out.println("basamak sayısı: " + counter);
        System.out.println("basamak toplamı: " + sum);
    }
}