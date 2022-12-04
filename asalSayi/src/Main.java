// 1 - 100 arasındaki asal sayıları ekrana yazdıran program
public class Main {
    public static void main(String[] args) {

        // 1 -100 arası tanımlama
        for (int i = 1; i <=100; i++) {

            if( i == 2 || i == 3 || i == 5 || i == 7){
                System.out.println(i);
            }else{
                if(!(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)){

                    if(i != 1){
                        System.out.println(i);
                    }
                }

            }

        }
    }
}