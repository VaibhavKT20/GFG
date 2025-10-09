class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        result.add(min);
        result.add(max);
        return result;
    }
}
