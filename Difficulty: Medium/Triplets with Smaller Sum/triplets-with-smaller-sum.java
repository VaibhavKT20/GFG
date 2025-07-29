// User function Template for Java

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long count=0;
        if (n < 3) return 0;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                long total=arr[i]+arr[j]+arr[k];
                if(total<sum){
                    count+=(k-j);
                    j++;
                }
                else{
                    k--;
                }
            }
            
        }
        return count;
        
    }
}
