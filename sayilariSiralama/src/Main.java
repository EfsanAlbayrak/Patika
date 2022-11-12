import java.util.Scanner;
//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
public class Main {
    public static void main(String[] args) {

        //gerekli değişkenlerin tanımlanması
            int n1,n2,n3;

            Scanner inp = new Scanner(System.in);

            //kullanıcıdan gerekli verilerin alınması
            System.out.print("1. sayıyı giriniz: ");
            n1 = inp.nextInt();
            System.out.print("2. sayıyı giriniz: ");
            n2 = inp.nextInt();
            System.out.print("3. sayıyı giriniz: ");
            n3 = inp.nextInt();

            //girilen sayıların sıralanması
            if((n1>n2) && (n1>n3)){
                if(n2>n3){
                    System.out.println("1>2>3");
                }
                else{
                    System.out.println("1>3>2");
                }
            }
            else if((n2>n1) && (n2>n3)){
                if (n1>n3){
                    System.out.println("2>1>3");
                }
                else
                {
                    System.out.println("2>3>1");
                }
            }
            else{
                if(n1>n2){
                    System.out.println("3>1>2");
                }
                else{
                    System.out.println("3>2>1");
                }
            }
        }
    }
