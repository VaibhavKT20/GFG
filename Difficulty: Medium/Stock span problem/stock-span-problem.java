
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            int span=st.isEmpty()? i+1 :i-st.peek();
            result.add(span);
            st.push(i);
        }
        return result;
    }
}