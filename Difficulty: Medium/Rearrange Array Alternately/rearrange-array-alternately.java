class Solution {
    public void rearrange(int arr[]) {
        // code here
        
        int n=arr.length;
        Arrays.sort(arr);
        int []temp=new int[n];
        int start=0;
        int end=n-1;
        int idx=0;
        while(start<=end){
            if(idx%2==0){
                temp[idx++]=arr[end--];
            }
            else{
                temp[idx++]=arr[start++];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
