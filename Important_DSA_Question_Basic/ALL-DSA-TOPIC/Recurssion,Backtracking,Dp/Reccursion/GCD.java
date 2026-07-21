import java.util.*;
//greatest common divisor...  time complixity is min(a,b);

// lcm * gcd =a*b;
public class GCD {
    //Euclids Algorithm...
    public static int iGCD(int a, int b){
        if(b==0){
            return a;
        }
        return iGCD(b, a%b);
    }

    public static int GCD(int a, int b){
        // while(a%b!=0){
        //     int rem=a%b;
        //     a=b;
        //     b=rem;
        // }
        // return b;

        int res=Math.min(a, b);
        while(res!=0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(GCD(12,16));
        System.out.println(iGCD(12,16));
        int lcm=12*16/iGCD(12,16);
        System.out.println("Lmc is "+lcm);

    }
}
