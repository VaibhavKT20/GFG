class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        result.add(arr[0]);
        if(arr.length==0){
            return result;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                result.add(arr[i]);
            }
        }
        return result;
    }
}
