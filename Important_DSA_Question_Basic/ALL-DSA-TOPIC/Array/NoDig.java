public class NoDig{
    public static void main(String[] args) {
        int num=12111;
        int noOfDig=0;
        while(num!=0){
            num=num/10;
            noOfDig++;
        }
        System.out.println("No of digit is "+noOfDig);
    }
}