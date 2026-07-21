public class Multiple {

    static int mul(int n,int k){
        if(k==0){
            return n;
        }

        return mul(n,k-1)+n;
    }
    public static void main(String[] args) {
        int n=5;
        int k=4;

        for(int i=0;i<k;i++){
            System.out.print(mul(n, i)+" ");
        }
    }
    
}
