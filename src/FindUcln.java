import java.util.Scanner;

public class FindUcln {
    public static int findUCLN(int a, int b){
        Math.abs(a);
        Math.abs(b);
        if ( a == 0 || b == 0 ){
                System.out.println(" không có ước số chung lớn nhất!");

        }
        if ( a == b){
            return a;
        }
        if (a > b){
            a -=b;
            return a;
        }else {
            b -=a;
            return b;
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("mời bạn nhập a: ");
        int a = scan.nextInt();
        System.out.println("mời bạn nhập b: ");
        int b = scan.nextInt();
        int result = findUCLN(a,b);
        System.out.println("Ước chung lớn nhất bạn đang tìm là: "+result);

    }
}
