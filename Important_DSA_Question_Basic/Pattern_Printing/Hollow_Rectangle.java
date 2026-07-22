package Pattern_Printing;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        for(int row=1;row<=7;row++){
            for(int col=1;col<=5;col++){
                if(row==1 || row==7 ||col==1 || col==5)  System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
