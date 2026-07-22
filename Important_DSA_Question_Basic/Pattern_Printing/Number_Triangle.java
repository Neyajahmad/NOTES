package Pattern_Printing;

import java.util.Scanner;

public class Number_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){ // print 4 spcae if n=5 {think like greater minum one}
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){ // print onl one formula 
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
