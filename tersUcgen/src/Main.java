import java.util.Scanner;

//basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen program
public class Main {
    public static void main(String[] args) {

        //değişken tanımlanması
        int num;

        //kullanıcıdan üçgenin yüksekliğinin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        num = input.nextInt();

        //ters üçgenin oluşturulması
        for(int i = 0; i <= num; i++){

            for (int j = 1 ; j <= i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= (2*num-(2*i+1)); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}