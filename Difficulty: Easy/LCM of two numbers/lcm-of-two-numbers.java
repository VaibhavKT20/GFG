class Solution {
    public int lcm(int a, int b) {
        // code here
        return (a*b )/gcd(a,b);
    }
    public int gcd(int a,int b){
        return (b==0?a:gcd(b,a%b));
    }
}