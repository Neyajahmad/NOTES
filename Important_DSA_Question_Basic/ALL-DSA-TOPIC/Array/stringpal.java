public class stringpal {
    public static void main(String[] args) {
        String a="abaa";
        int len=a.length();
        int j=len-1;
        for(int i=0;i<j;i++,j--){
            if(a.charAt(i)!=a.charAt(j)){
                System.out.println("Number is not palindrom");
                return;
            }
        }
        System.out.println("Number is palindrom");
    }
    
}
