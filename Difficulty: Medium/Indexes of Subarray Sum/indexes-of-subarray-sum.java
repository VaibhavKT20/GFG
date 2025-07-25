
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int n=arr.length;
        for(int start=0;start<n;start++){
            int sum=0;
            for(int end=start;end<n;end++){
                sum+=arr[end];
                
                if(sum==target){
                    result.add(start+1);
                    result.add(end+1);
                    return result;
                }
            }
            
            
        }
        return new ArrayList<>(Arrays.asList(-1));
    }
}
