package Pattern_Printing;

import java.util.Scanner;

// right angle triangle
public class Zero_One_Pattern {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(1);
                }
                else System.out.print(0);
            }
            System.out.println();
        }
    }
}
