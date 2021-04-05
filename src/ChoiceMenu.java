import java.util.Scanner;

public class ChoiceMenu {
    public static void drawTriangle(){
        for ( int i = 5; i >= 1; i--){
            for ( int j = 1; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void Drawsquare(){
        for ( int i = 0; i <= 5; i++ ){
            for ( int j = 0; j <= 5; j++ ){
                System.out.print("* "+"  ");
            }
            System.out.println(" ");
        }
}

    public static void Drawrectangle(){
        for ( int i = 0; i <= 5; i++ ){
            for ( int j = 0; j <= 3; j++ ){
                System.out.print("*"+ "  ");
            }
            System.out.println("");
        }
}

    public static void main(String[] args) {
       int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("MeNu");
        System.out.println("1: drawTriangle");
        System.out.println("2: Drawsquare");
        System.out.println("3:Drawrectangle");
        System.out.println("0:exit");
        System.out.println("Mời ban nhập sự lựa chọn: ");
        choice = scanner.nextInt();
        switch (choice){
            case 0:
                System.exit(0);
                break;
            case 1:
                drawTriangle();
                break;
            case 2:
                Drawsquare();
                break;
            case 3:
                Drawrectangle();
                break;
            default:
                System.out.println("không có trong menu");
        }


    }
}
