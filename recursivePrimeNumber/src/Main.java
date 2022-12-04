import java.util.Scanner;
// "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan program
public class Main {
    //recursive asal sayı bulan methot
    static String isPrime(int num, int i) {

        if (i == (num / 2) + 1 ) {
            return num + " asal sayıdır.";
        }

        if ( num % i == 0) {
            return  num + " asal sayı değildir.";
        }
        i++ ;
        return isPrime(num, i);

    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int i = 2 ;
        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();

        System.out.println(isPrime(number, i));

    }
}