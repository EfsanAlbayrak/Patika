import java.util.Scanner;

/*Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Kilo (kg) / Boy(m) * Boy(m)*/
public class Main {

    public static void main(String[] args) {

        //Gerekli değişkenlerin tanımlanması
        double boy, kilo, vucutKitleIndexi;
        
        Scanner input = new Scanner(System.in);

        //kullanıcıdan boy ve kilo değerlerinin alınması
        System.out.println("Lütfen boyunuzu giriniz: ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        //vücut kitle indexinin hesaplanması
        vucutKitleIndexi = kilo/ (boy*boy);

        System.out.println("Vücüt Kitle İndexiniz: " + vucutKitleIndexi);

    }
}
