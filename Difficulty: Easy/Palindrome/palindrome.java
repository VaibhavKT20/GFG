class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int temp=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev==temp;
    }
}