import java.util.Scanner;
   /* Java ile matematik, fizik, kimya, türkçe, tarih ve müzik derslerinin sınav puanları alınacak ve
         ortalama hesaplanacak (geçti-geçmedi), ekrana verilecek */
public class Main {
       public static void main(String[] args) {

           // değişkenler
           int matematik, fizik, kimya, turkce, tarih, muzik;


           Scanner grade = new Scanner(System.in);

           //kullanıcının notları
           System.out.println("Lütfen sınav notlarını giriniz");

           System.out.print("Matematik notu:");
           matematik = grade.nextInt();

           System.out.print("Fizik notu:");
           fizik = grade.nextInt();

           System.out.print("Kimya notu:");
           kimya = grade.nextInt();

           System.out.print("Türkçe notu:");
           turkce = grade.nextInt();

           System.out.print("Tarih notu:");
           tarih = grade.nextInt();

           System.out.print("Müzik notu:");
           muzik = grade.nextInt();

           // ortalamayı hesaplamak için toplam adında değişken tanımlandı ve ders sayısına bölünerek ort hesaplandı
           int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
           float ort = toplam / 6f;

           System.out.println("Öğrenci ortalaması:" + ort);
           String kosul = (ort >= 60) ? "Sınıfı Geçti." : "Sınıfta Kaldı.";
           System.out.print(kosul);
       }
   }