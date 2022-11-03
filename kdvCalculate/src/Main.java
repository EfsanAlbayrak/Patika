import java.util.Scanner;

/* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
    tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

public class Main {
    public static void main(String[] args) {

        float tutar, kdvTutari, kdvliTutar, oran1 = 0.18f, oran2 = 0.08f;

        Scanner inp = new Scanner(System.in);
        System.out.print("Tutarı giriniz:");
        tutar = inp.nextFloat();

        //kdv tutarının hesabı
        kdvTutari = tutar < 1000 ? ((tutar * oran1)) : ((tutar * oran2));
        //kdv ilave edilmiş tutarın hesabı
        kdvliTutar = tutar < 1000 ? ((tutar * oran1) + tutar) : ((tutar * oran2) + tutar);

        System.out.println("Tutar: " + tutar + "TL");

        System.out.println("0-1000 TL arası KDV Oranı: " + oran1);
        System.out.println("1000 TL ve daha fazlası için KDV Oranı: " + oran2);

        System.out.println();
        System.out.println("Kdv Tutarı: " + kdvTutari);
        System.out.println();
        System.out.println("Girilen tutar için KDV'li fiyat: " + kdvliTutar+ "TL");

    }
}