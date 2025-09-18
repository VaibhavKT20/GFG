class Solution {
    public int minJumps(int[] arr) {
        // code here
        int jumps=0;
        int currEnd=0;
        int farthest=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            farthest=Math.max(farthest,i+arr[i]);
            if(i==currEnd){
                jumps++;
                currEnd=farthest;
            }
            if(farthest<=i){
                return -1;
        
            }
        }
        return jumps;
    }
}