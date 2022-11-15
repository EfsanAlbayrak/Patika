import java.util.Scanner;
//ATM işlemlerini "Switch-Case" kullanarak program.
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        //değişkenlerin tanımlanması
        String userName, password;
        int right = 3;
        double balance = 3000;
        int select, price;

        //switch-case ile atm senaryosu
        while (right > 0) {

            System.out.print("Kullanıcı Adınız: ");
            userName = inp.nextLine();
            System.out.print("Şifreniz: ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("123")) {
                System.out.println("Patika Bankasına Hoşgeldiniz!\nHangi işlemi yapmak istersiniz?");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırılacak Tutar: ");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekilecek Tutar: ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.print("Yetersiz Bakiye.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("İyi Günler...");
                break;
            } else {
                //kullanıcı adı ve şifreyi yanlış girme durumu
                right--;
                System.out.println("Tekrar Deneyiniz, Hatalı Giriş!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke oldu, bankayla iletişime geçin!");
                } else {
                    System.out.println("Kalan Deneme Hakkınız: " + right);
                }

            }

        }    }
}