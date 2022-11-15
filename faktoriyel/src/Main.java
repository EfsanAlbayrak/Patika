import java.util.Scanner;
//Java ile kombinasyon hesaplayan program
public class Main {
    public static void main(String[] args) {

        //değişkenlerin tanımlanması
        int n , r,comb, facN = 1, facR = 1, facNR=1;
        Scanner input = new Scanner(System.in);

        //kullanıcıdan verilerin alınması
        System.out.println("N’in r’li kombinasyonu C(n,r) için 2 sayı giriniz.");
        System.out.println("n: ");
        n = input.nextInt();
        System.out.println("r: ");
        r = input.nextInt();

        //kombinasyonun hesaplanması
        while(n<r){
            System.out.println("Lütfen eleman sayısından (n) küçük bir seçim sayısı (r) giriniz.");
            r = input.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            facN = i * facN;
        }
        for (int i = 1; i <= r; i++) {
            facR = i * facR;
        }
        for (int i = 1; i <= (n-r); i++){
            facNR = i * facNR;
        }

        comb = facN / (facR * facNR);

        System.out.println("sonuç: " + comb);
    }
}