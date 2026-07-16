import java.util.Arrays;
import java.util.Scanner;

public class AnagramNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // char arr1[]=s1.toCharArray();
        // char arr2[]=s2.toCharArray();

        if(s1.length()!=s2.length()){
            System.out.println("String is not anagram");
            return;
        }

        // timecomplexity : O(nlogn)
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // if(Arrays.equals(arr1, arr2)){
        //     System.out.println("String is anagram");
        // }
        // else{
        //     System.out.println("String is not anagram");
        // }

        // TimeComplexity : O(n)
        int arr[]=new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for(int i : arr){
            if(i!=0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
