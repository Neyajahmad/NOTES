public class fibo {
    private static int Reccurfibo(int n){
        // System.out.println("calculating fibo of :"+n);
        if(n==1 || n==0){
            return 1;
        }
        else{
            return Reccurfibo(n-1)+Reccurfibo(n-2);
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Reccurfibo(n));
    }
    
}
