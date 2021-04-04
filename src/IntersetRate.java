import java.util.Scanner;

public class IntersetRate {
    public double intersetRate(double money, double intersetRate, int month){
        double Interset = 0;
        for ( int i =0; i < month; i++ ){
            Interset += money * ( intersetRate /100)/12 * month;
        }
        return Interset;

    }


    public static void main(String[] args) {
        IntersetRate total = new IntersetRate();
        Scanner scan = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền gửi: ");
        double money = scan.nextInt();
        System.out.print("Mời bạn nhập lãi suất: ");
        double intersetRate = scan.nextDouble();
        System.out.print("Mời bạn nhập số tháng gửi tiền: ");
        int month = scan.nextInt();
        System.out.print(total.intersetRate(money,intersetRate,month));

    }
}
