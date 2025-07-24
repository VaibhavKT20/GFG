// User function Template for Java
class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n=arr.length;
        int maxFromRight=-1;

        for(int i=n-1;i>=0;i--){
            int temp=arr[i];
            result.add(0,maxFromRight);
            if(temp>maxFromRight){
                maxFromRight=temp;
            }
        }
        return result;
    }
}