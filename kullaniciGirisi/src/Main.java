import java.util.Scanner;
/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması
 gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
 sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
public class Main {
    public static void main(String[] args) {

        //değişken tanımlanması
        String userName, password, choice, newPassword;

        Scanner input = new Scanner(System.in);

        //kullanıcıdan verilerin alınması
        System.out.print("Kullanıcı adınızı giriniz:");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz:");
        password = input.nextLine();

        //kullanıcı adı ve şifre kontrolü
        if(userName.equals("Efsan") && password.equals("2357")){
            System.out.println("Giriş Başarılı!");
        }
        else{
            System.out.println("Yanlış şifre!");
            System.out.println("Şifrenizi yenilemek ister misiniz? (Y/N) ");
            choice = input.nextLine();
            if(choice.equals("Y") || choice.equals("y")) {
                System.out.print("Yeni şifreniz:");
                newPassword = input.nextLine();
                if(newPassword.equals(password)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz." );
                }
                else{
                    System.out.println( "Şifre oluşturuldu" );
                }

            }


        }
    }
}