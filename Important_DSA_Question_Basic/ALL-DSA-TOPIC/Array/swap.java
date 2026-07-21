//swap 2 number

public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        // method one 
        // int temp=a;
        // a=b;
        // b=temp;
        // System.out.println("Value of a is :"+a+" and b is :"+b);


        // method 2 

         a=a+b;
         b=a-b;
         a=a-b;

        System.out.println("Value of a is:"+a+" b is "+b);
    }
    
}
