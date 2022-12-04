import java.util.Scanner;
//Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
public class Main {
    static String isPalindrome(int num){
        //değişken tanımlama
        int finish = num, reverseNumber = 0, lastNumber;

        while (finish != 0) {
            lastNumber = finish % 10; //sayının son elemanı 123 -> 3 , 12 -> 2, 1 -> 1
            reverseNumber = (reverseNumber * 10) + lastNumber; // (0*10) + 3 -> 3, (3*10) + 2 -> 32, (32*10) + 1 -> 321
            finish /= 10; // sayı basamağı azaltma 123/10 -> 12, 12/10 -> 1, 1/10 -> 0
        }

        if (num == reverseNumber) {

            return (num + " palindrome bir sayıdır .");
        } else {
            return (num + " palindrome bir sayı değildir.");

        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Kontrol edilecek sayıyı giriniz: ");
        number = input.nextInt();

        System.out.println(isPalindrome(number));

    }
}