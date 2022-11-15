import java.util.Scanner;
/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
sayıların ortalamasını hesaplayan programı yazınız.*/
public class Main {
    public static void main(String[] args) {
        //değişkenler tanımlanması
        int number, counter = 0, total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan sayı istenmesi
        System.out.println("Bir sayı giriniz:");
        number = input.nextInt();

//3 e ve 4 e aynı anda bölünmeyen sayılar için bir uyarı mesajının yazdırılması ve bölünenler için ise sayıların toplanması
        if (number < 12) {
            System.out.println("Bu sayı 3 ve 4e aynı anda bölünemez");
        } else {
            System.out.println("3 ve 4'e tam bölünen sayılar: ");
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 4 == 0) {

                    total = total + i;
                    counter++;
                    System.out.println(i);

                }
            }

            average = total / counter;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        }
    }
}