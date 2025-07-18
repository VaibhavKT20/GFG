
class Solution {
    // Function to sort the binary array in non-decreasing order
    public void binSort(int[] arr) {
        // code here
        int n=arr.length;
        int one=0;
        int zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }
        }
      
        for(int i=0;i<zero;i++){
            arr[i]=0;
            
        }
        for(int i=zero;i<n;i++){
            arr[i]=1;
        }
        
    }
}
