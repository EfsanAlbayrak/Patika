import java.util.Scanner;
//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan program

public class Main {
    public static void main(String[] args) {

       //kullanıcıdan verileri alma
        int base, exp, result =1;

        Scanner input = new Scanner(System.in);

        //kullanıcıdan gerekli verilerin alınması
        System.out.print("Taban : ");
        base = input.nextInt();

        System.out.print("Üs : ");
        exp = input.nextInt();

        //üslü sayının hesaplanması
        for (int i=1; i<=exp; i++){
            result *= base;
        }

        System.out.print("Cevap--> " + result);
    }
}