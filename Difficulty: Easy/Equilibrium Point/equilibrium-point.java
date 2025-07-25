class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            totalSum-=arr[i];
            if(totalSum==leftSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
        
        
        
    }
}
