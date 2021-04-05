import java.util.Scanner;

public class InptNumber {
    public static int scanerN(Scanner scanner){
        int number;
        do{
            System.out.println("mời bạn nhập vào số lớn hơn không");
            number = scanner.nextInt();
        }while(number < 1);
        return number;
    }
    public static int[] inputArray( Scanner scanner, int number){
        int arry[] = new int[number];
        for ( int i = 0; i < arry.length; i++){
            System.out.print("a["+i+"] = " );
            arry[i] = scanner.nextInt();

        }return arry;
    }
    public static void showArray(int arry[]){
        for (int mang :arry ) {
            System.out.println(mang);
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanerN(scanner);

        int array[] = inputArray(scanner,a);
        System.out.println();
        showArray(array);
    }
}

