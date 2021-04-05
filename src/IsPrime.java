import java.util.Scanner;

public class IsPrime {
    static boolean isPrime( int number){
        if ( number < 2 ){
          return false;
        }
        for ( int i = 2; i <= Math.sqrt(number); i++ ){
            if (number % i == 0 ){
              return false;
            }
        }return true;
    }
    static void Showall(int n){
        int count = 0;
        int number = 2;
        while (count<=n){
            if (isPrime(number))
            System.out.println(number+ ",");
            count++;
            number++;
        }
    }


    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Mời bạn nhập số cần kiểm tra: ");
//        int number = scan.nextInt();
//        if (isPrime(number)){
//            System.out.println(number+ " là số nguyên tố!");
//        }else {
//            System.out.println(number+" không phải là số nguyên tố!");
//        }
        Showall(20);

    }
}
