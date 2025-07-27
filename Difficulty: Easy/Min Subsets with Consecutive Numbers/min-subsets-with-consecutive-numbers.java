// User function Template for Java

class Solution {
    public int numOfSubset(int[] arr) {
        // Your code goes here
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(!set.contains(num-1)){
                int current=num;
                
                while(set.contains(current+1)){
                    current++;
                }
                count++;
            }
           
          
        }
        return count;
    }
}