package Pattern_Printing;

// logic is same but we do spacing 2 time only for perfect output.
public class Full_Pyramid {
    public static void main(String[] args) {
        // upper pyramid
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){ // 5-i bcz i have not to print always 4 space
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower pyramid

        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*(5-i)+1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
    