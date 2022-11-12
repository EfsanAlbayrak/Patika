import java.util.Scanner;
/*Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun*/
public class Main {
    public static void main(String[] args) {

        int year, result;
        String zodiacSign  = " ";

        Scanner input = new Scanner(System.in);

        System.out.print(" Doğum Yılınız : ");
        year = input.nextInt();

        result = year % 12; //12 ile moddan kalınan bulunur

        switch (result) {
            case 0: // kalan 0'sa
                zodiacSign = "Maymun";
                break;
            case 1: // kalan 1'se
                zodiacSign = "Horoz";
                break;
            case 2:
                zodiacSign = "Kopek";
                break;
            case 3:
                zodiacSign = "Domuz";
                break;
            case 4:
                zodiacSign = "Fare";
                break;
            case 5:
                zodiacSign = "Okuz";
                break;
            case 6:
                zodiacSign = "Kaplan";
                break;
            case 7:
                zodiacSign = "Tavsan";
                break;
            case 8:
                zodiacSign = "Ejderha";
                break;
            case 9:
                zodiacSign = "Yilan";
                break;
            case 10:
                zodiacSign = "At";
                break;
            case 11:
                zodiacSign = "Koyun";
                break;
        }

        System.out.println("Çin Zodyağı Burcunuz : " + zodiacSign);
    }

    }
