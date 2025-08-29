class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> result=new ArrayList<Integer>();
        Stack<Integer> s=new Stack<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            int nextGreater= s.isEmpty() ? -1 : s.peek();
            result.add(0, nextGreater);
            s.push(arr[i]);
        }
        return result;
        
    }
}