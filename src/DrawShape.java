public class DrawShape{
    public static void drawrectangle(){
        for ( int i = 0; i < 4; i++ ){
            for ( int j = 0; j < 6; j++ ){
                System.out.print("*" + "  ");
            }
            System.out.println("");
        }
    }
    public static void drawTriangleTop(){
        for ( int i = 5; i >= 1; i-- ){
            for ( int j = 0; j < i; j++ ){
                System.out.print("*"+ "  ");
            }
            System.out.println("");
        }
    }
    public static void drawTriangledown(){
        for ( int i = 0; i < 5; i++ ){
            for ( int j = 0; j <=i ; j++ ){
                System.out.print("*"+ "  ");
            }
            System.out.println("");
        }
    }
    public static void drawTriangleft(){
        for ( int i = 1; i <= 4; i++ ){
            for ( int j = 0; j <i ; j++ ){
                System.out.print("a "+ "  ");
            }
            System.out.println("");
        }
        for ( int i = 3; i >=0; i-- ){
            for ( int j = 0; j < 4 - (1 + i); j++){
                System.out.print("*"+ "  ");
            }
        }
    }






    public static void main(String[] args) {
//        drawrectangle();
//        drawTriangleTop();
//        drawTriangledown();
        drawTriangleft();
    }
}
