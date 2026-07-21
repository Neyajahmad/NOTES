package Pattern;

public class Inverted_Pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*(5-i)+1);j++){ // formula for printing star (get first 9 thinking of 5 rows)
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
