public class ProductPuzzleArray {
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        
        long[] left = new long[n];
        long[] right = new long[n];
        long[] ans = new long[n];
        
        if(n==1){
            ans[0] = 1;
            return ans;
        }
        
        long prod =1;
        
        for(int i=0; i<n; i++){
            prod*=nums[i];
            left[i] = prod;
        }
        prod=1;
        for(int i=n-1; i>=0; i--){
            prod*=nums[i];
            right[i] = prod;
        }
        
        ans[0] = right[1];
        ans[n-1] = left[n-2];
        
        for(int i=1; i<n-1; i++){
            ans[i] = left[i-1]*right[i+1];
        }
        
        return ans;
	} 
}

