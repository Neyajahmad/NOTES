public class Palindroms{
    public static void main(String[] args) {
        int reverse = 0;
        int num = 121;
        int org = num;

        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10; 
        }

        if (org == reverse) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
}
