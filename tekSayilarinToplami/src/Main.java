import java.util.Scanner;
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
// çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
public class Main {
    public static void main(String[] args) {
        //değişken tanımlanması
        int number, total = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        //kullanıcıdan veri alınması
        number = inp.nextInt();

        //tek bir sayı girilene kadar kullanıcıdan girişleri kabul eder ve girilen değerlerden
        //çift ve 4'ün katları olan sayıları toplayıp ekrana basar
        while(number % 2 == 0){
            if(number % 4 == 0){
                total += number;
                System.out.println("Toplam:"+total);
            }
            System.out.println("Bir sayi giriniz: (Çıkmak için tek bir sayi giriniz) ");
            number = inp.nextInt();


        }
    }
}