class Solution {
    public void arrange(long[] arr) {
        long n=arr.length;
        for(int i=0;i<n;i++){
            long newVal = arr[(int)(arr[i])] % n;
            arr[i]=arr[i]+newVal*n;
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/n;
        }
    }
}