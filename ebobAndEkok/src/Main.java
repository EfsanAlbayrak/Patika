import java.util.Scanner;
//Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" ile bulan program
public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                //değişken tanımlanması
                int number1,number2;

                System.out.print("1. sayıyı gir: ");
                number1 = sc.nextInt();

                System.out.print("2. sayıyı gir: ");
                number2 = sc.nextInt();

                int i = 1;
                int ebob = 1;
                //ebobun hesaplanması
                while (i <= number1) {

                    if (number1 % i == 0 && number2 % i == 0) {

                        ebob = i;

                    }

                    i++;

                }

                System.out.println("EBOB: " + ebob);
                //ekokun hesaplanması
                System.out.print("EKOK: " + (number1*number2) / ebob);

            }
        }
