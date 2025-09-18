// User function Template for Java

class Solution {
    int sumOfSeries(int n) {
        // code here
        if(n==1){
            return 1;
        }
        int result=sumOfSeries(n-1);
        result+=n*n*n;
        return result;
    }
}