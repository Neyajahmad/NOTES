public class pow2 {

    static int pow(int p, int q){
        if(q==0){
            return 1;
        }
        int smallpow=pow(p,q/2);


        if(q%2==0){
            // return pow(p,q/2)*pow(p,q/2); // O(q)
            return smallpow*smallpow;
        }
            return smallpow*smallpow*p;
    }
    public static void main(String[] args) {
        int p=2;
        int q=4;

        System.out.println(pow(p, q));
        

    }
    
}
