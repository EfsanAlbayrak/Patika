import java.util.Scanner;
//klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan program
public class Main {
    public static void main(String[] args) {
        //değişken tanımlama
        int countNumber, number ;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        countNumber = input.nextInt();

        //max ve min numaraların hesaplanması
        for (int i = 1; i <=countNumber; i++) {

            System.out.println(  i + ". sayıyı giriniz :");
            number = input.nextInt();

            if(number > maxNum){
                maxNum = number;
            }

            if(number < minNum ){
                minNum = number;
            }

        }

        System.out.println("En küçük sayı: " + minNum);
        System.out.println("En büyük sayı: " + maxNum);
    }
}