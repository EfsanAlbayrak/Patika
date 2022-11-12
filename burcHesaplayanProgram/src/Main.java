import java.util.Scanner;
// Burç hesaplayan program

public class Main {
    public static void main(String[] args) {

        //gerekli değişkenlerin tanımlanması
        int month,day;

        Scanner inp = new Scanner(System.in);

        //kullanıcıdan gerekli verilerin alınması
        System.out.println("Doğum ayınızı giriniz:");
        month = inp.nextInt();

        System.out.println("Doğum gününüzü giriniz:");
        day = inp.nextInt();

        //ay ve güne göre burcun hesaplanması
        if((day>=21 && month==3) || (day<=20 && month==4)){
            System.out.println("Koç Burcu");
        }
        else if((day>=21 && month==4) || (day<=21 && month==5)){
            System.out.println("Boğa Burcu");
        }
        else if((day>=22 && month==5) || (day<=22 && month==6)){
            System.out.println("İkizler Burcu");
        }
        else if((day>=23 && month==6) || (day<=22 && month==7)){
            System.out.println("Yengeç Burcu");
        }
        else if((day>=23 && month==7) || (day<=22 && month==8)){
            System.out.println("Aslan Burcu");
        }
        else if((day>=23 && month==8) || (day<=22 && month==9)){
            System.out.println("Başak Burcu");
        }
        else if((day>=23 && month==9) || (day<=22 && month==10)){
            System.out.println("Terazi Burcu");
        }
        else if((day>=23 && month==10) || (day<=21 && month==11)){
            System.out.println("Akrep Burcu");
        }
        else if((day>=22 && month==11) || (day<=21 && month==12)){
            System.out.println("Yay Burcu");
        }
        else if((day>=22 && month==12) || (day<=21 && month==1)){
            System.out.println("Oğlak Burcu");
        }
        else if((day>=22 && month==1) || (day<=19 && month==2)){
            System.out.println("Kova Burcu");
        }
        else
            System.out.println("Balık Burcu");

    }
}