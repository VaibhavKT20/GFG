class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int originalA = a;
        int originalB = b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int lcm=Math.abs((originalA*originalB)/gcd);
        return new int[]{lcm, gcd};
    }
}