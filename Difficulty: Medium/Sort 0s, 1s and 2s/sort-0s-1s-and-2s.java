class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int n=arr.length;
        int zero=0 ,one=0, two=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                one++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                two++;
            }
        }
        
        int index=0;
        for(int i=0;i<zero;i++){
            arr[index++]=0;
        }
        for(int i=0;i<one;i++){
            arr[index++]=1;
        }
        for(int i=0;i<two;i++){
            arr[index++]=2;
        }
    }
}