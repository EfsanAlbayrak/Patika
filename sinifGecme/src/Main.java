import java.util.Scanner;
/*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/
public class Main {
    public static void main(String[] args) {
        //dersler: mat,fiz,türkçe,kimya,müzik

        int math,physic,turkish,chemistry,music;
        double avg;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan verilerin alınması
        System.out.print("Matematik notunuzu giriniz: ");
        math = input.nextInt();
        if (math<0 || math>100){
            math=0;
        }
        System.out.print("Fizik notunuzu giriniz: ");
        physic = input.nextInt();
        if (physic<0 || physic>100){
            physic=0;
        }
        System.out.print("Türkçe notunuzu giriniz: ");
        turkish = input.nextInt();
        if (turkish<0 || turkish>100){
            turkish=0;
        }
        System.out.print("Kimya notunuzu giriniz: ");
        chemistry = input.nextInt();
        if (chemistry<0 || chemistry>100){
            chemistry=0;
        }
        System.out.print("Müzik notunuzu giriniz: ");
        music = input.nextInt();
        if (music<0 || music>100){
            music=0;
        }

        //Not ort hesaplanması
        avg = (math + physic + turkish + chemistry + music) / 5;
        System.out.println(avg);

        //Sınıfı geçip geçmediğinin belirlenmesi
        if(avg <= 55 ){
            System.out.println("Sınıfta Kaldınız!");
        }
        else System.out.println("Sınıfı Geçtiniz!");

    }
}