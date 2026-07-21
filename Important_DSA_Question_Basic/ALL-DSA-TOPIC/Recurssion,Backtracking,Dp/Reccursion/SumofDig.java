public class SumofDig {

   public static int sum(int n){
    if(n>=0 && n<=9){
        return n;
    }

    return sum(n/10)+n%10;

    }
    public static void main(String[] args) {
        int dig=1234;
        System.out.print(sum(dig));

    }
    
}
