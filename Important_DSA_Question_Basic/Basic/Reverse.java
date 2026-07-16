import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // // Reverse number 
        // int num=sc.nextInt();
        // int temp=num;
        // int answer=0;
        // while(temp>0){
        //     int rev=temp%10;
        //     answer=answer*10+rev;
        //     temp=temp/10;
        // }

        // System.out.println("Reverse of number is : "+answer);


        // Reverse String

        String str=sc.nextLine();
        // String rev=new StringBuilder(str).reverse().toString();
        // System.out.println(rev);
        char arr[]=str.toCharArray();
        for(int i=0,j=arr.length-1;i<j;){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    
}
