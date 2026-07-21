public class count {

    public static int count(int dig){
        if(dig>=0 && dig<=9){
            return 1;
        }
        return 1+count(dig/10);
    }
    public static void main(String[] args) {
        int dig=123;
        System.out.println(count(dig));
    }
    
}
