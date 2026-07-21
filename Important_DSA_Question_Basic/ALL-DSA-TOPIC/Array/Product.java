//Product of Array Except Self.

public class Product {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        // int ans[]=new int[arr.length];



        // by calculating prod then divide by self element
    //     int prod=1;
    //     for(int i=0;i<arr.length;i++){
    //      prod*=arr[i];
    //     }

    //     int ans[]=new int[arr.length];
    //     for(int i=0;i<arr.length;i++){
    //         ans[i]=prod/arr[i];
    //     }

    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(ans[i]+" ");
    //     }



    //by nested loop
    
    // for(int i=0;i<arr.length;i++){
    //     int prod=1;
    //     for(int j=0;j<arr.length;j++){
    //         if(i!=j){
    //             prod*=arr[j];
    //         }
    //     }
    //     ans[i]=prod;
    // }

    // for(int i=0;i<arr.length;i++){
    //     System.out.print(ans[i]+" ");
    // }


    // by O(n) --> time , space ->0(n)

    // int pref[]=new int[arr.length];
    // pref[0]=1;
    // for(int i=1;i<arr.length;i++){
    //     pref[i]=pref[i-1]*arr[i-1];
    // }
    
    // int suff[]=new int[arr.length];
    // suff[arr.length-1]=1;
    // for(int i=arr.length-2;i>=0;i--){
    //     suff[i]=suff[i+1]*arr[i+1];
    // }


    // for(int i=0;i<arr.length;i++){
    //     ans[i]=pref[i]*suff[i];
    // }

    // for(int i=0;i<arr.length;i++){
    //     System.out.print(ans[i]+" ");
    // }


    // O(n)-->time , O(1)-->space.


    int n = arr.length;
    int ans[] = new int[n];
    ans[0]=1;

        // Calculate prefix products
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * arr[i - 1];
        }

        int suffix = 1; // Initialize suffix product as 1
        // Calculate suffix products and combine with prefix products
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix; // Multiply prefix product with suffix product
            suffix *= arr[i]; // Update suffix product
        }

        // Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
    }
}
}
