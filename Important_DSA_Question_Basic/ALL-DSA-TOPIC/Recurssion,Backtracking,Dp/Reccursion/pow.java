public class pow {

    static int power(int p,int q){
        if(q<=0){
            return 1;
        }

        return power(p,q-1)*p;

    }
    public static void main(String[] args) {
        int p=2;
        int q=4;

        System.out.println(power(p, q));
    }
    
}
