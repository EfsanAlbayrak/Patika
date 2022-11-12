import java.util.Scanner;
/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
public class Main {
    public static void main(String[] args) {
        //gerekli değişkenlerin tanımlanması
        int km,age,choice;
        double price,newPrice,secondPrice;

        Scanner inp = new Scanner(System.in);

        //gerekli değişkenlerin kullanıcıdan alınması
        System.out.print("Mesafe (KM) giriniz: ");
        km = inp.nextInt();

        price=km*(0.10);

        System.out.print("Yaşınızı giriniz:");
        age = inp.nextInt();

        System.out.print("Yolculuk tipi seçin (Tek Yön (1) - Gidiş-Dönüş(2)) : ");
        choice = inp.nextInt();

        while((km>0 && age>0) && (choice == 1 || choice == 2)){
            if(age<12){
                //yaş 12 den küçükse
                newPrice = price - (price*0.50);
                if(choice == 1){
                    //tek yön seçeneği
                    System.out.println("Ücret: " +newPrice+ "TL");
                }
                else{
                    //gidiş dönüş seçeneği
                    secondPrice = (newPrice - (newPrice * 0.20))*2;
                    System.out.println("Ücret: " +secondPrice+ "TL");
                }
            }
            else if(age>12 && age<24){
                // yaş 12-24 arasında
                newPrice = price - (price*0.10);
                if(choice == 1){
                    //tek yön seçeneği
                    System.out.println("Ücret: " +newPrice+ "TL");
                }
                else{
                    //gidiş dönüş seçeneği
                    secondPrice = (newPrice - (newPrice * 0.20))*2;
                    System.out.println("Ücret: " +secondPrice+ "TL");
                }

            }
            else if(age>65){
                // yaş 65 üzeri ise
                newPrice = price - (price*0.30);
                if(choice == 1){
                    //tek yön seçeneği
                    System.out.println("Ücret: " +newPrice+ "TL");
                }
                else{
                    //gidiş dönüş seçeneği
                    secondPrice = (newPrice - (newPrice * 0.20))*2;
                    System.out.println("Ücret: " +secondPrice+ "TL");
                }

            }
            else{
                //indirimsiz fiyat
                System.out.println(price + "TL");
            }
            break;
        }

        if((km<0 || age<0) || (choice != 1 && choice != 2)){
            System.out.println("Hatalı Veri Girdiniz !");
        }





    }
}