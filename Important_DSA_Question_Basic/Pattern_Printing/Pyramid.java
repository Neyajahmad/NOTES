package Pattern_Printing;

public class Pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){ // number of row
            for(int j=1;j<=(5-i);j++){  // space 4 spaces
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){ // number of star (only 1 star is print)
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
