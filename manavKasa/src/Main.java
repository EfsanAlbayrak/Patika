import java.util.Scanner;
/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine
göre toplam tutarını ekrana yazdıran programı yazın.*/
public class Main {
    public static void main(String[] args) {

        //Gerekli değişkenlerin ve değerlerinin tanımlanması
        double armut=2.14, elma=3.67 , domates=1.11, muz=0.95, patlican=5.00, total;
        int kilo;

        Scanner input = new Scanner(System.in);

        //Hangi mevye veya sebzeden kaçar kilo istediğinin kullanıcıdan alınması ve her aşamada fiyata eklenerek toplam fiyatın hesaplanması
        System.out.println("Armut (Kaç kilo): ");
        kilo = input.nextInt();
        total = kilo*armut;

        System.out.println("Elma (Kaç kilo): ");
        kilo = input.nextInt();
        total += kilo*elma;

        System.out.println("Domates (Kaç kilo): ");
        kilo = input.nextInt();
        total += kilo*domates;

        System.out.println("Muz (Kaç kilo): ");
        kilo = input.nextInt();
        total += kilo*muz;

        System.out.println("Patlıcan (Kaç kilo): ");
        kilo = input.nextInt();
        total += kilo*patlican;

        System.out.println("Toplam Tutar (TL): " + total + " TL");

    }
}
