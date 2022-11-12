import java.util.Scanner;
//hesap makinesi

public class Main {
    public static void main(String[] args) {

           //gerekli değişkenlerin tanımlanması
            int n1,n2,select;

            Scanner input = new Scanner(System.in);

            //kullanıcıdan verilerin alınması
            System.out.print("İlk sayıyı giriniz:");
            n1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz:");
            n2 = input.nextInt();

            System.out.println("Lütfen yapmak istediğiniz işlemi seçin:");
            System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
            select = input.nextInt();

            if(select == 1){
                System.out.println("TOPLAMA İŞLEMİNİN SONUCU: "+ (n1 + n2));
            }
            else if(select == 2){
                System.out.println("ÇIKARMA İŞLEMİNİN SONUCU: "+ (n1 - n2));
            }
            else if(select == 3){
                System.out.println("ÇARPMA İŞLEMİNİN SONUCU: "+ (n1 * n2));
            }
            else if(select == 4)
            {
                if(n2 != 0){
                    System.out.println("BÖLME İŞLEMİNİN SONUCU: "+ (n1 / n2));
                }
                else{
                    System.out.println("BİR SAYI 0'A BÖLÜNEMEZ!!");
                }


            }
            else {
                System.out.println("YANLIŞ SEÇİM!");
            }
        }
    }

