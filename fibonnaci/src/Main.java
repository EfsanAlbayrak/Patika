import java.util.Scanner;
//Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
public class Main {
    public static void main(String[] args) {

                //değişken tanımlanması
                Scanner reader = new Scanner(System.in);
                int n1=0,n2=1,n3,i,n;
                
                //kullanıcıdan terim sayısının alınması
                System.out.print("N Sayısını Girin:");
                n = reader.nextInt();

                //0 ve 1 yazdır
                System.out.print(n1+" "+n2);

                //Döngü 2 den başlıyor çünkü ilk 2 terim 0 ve 1 her zaman yazılacak
                for(i=2;i<n;++i)
                {
                    n3=n1+n2;
                    System.out.print(" "+n3);
                    n1=n2;
                    n2=n3;
                }
                System.out.println();
            }

        }


