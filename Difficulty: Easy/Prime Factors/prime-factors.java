class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        if(n==1){
            return result;
        }
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                if(!result.contains(i)){
                    result.add(i);
                }
                n=n/i;
            }
        }
        if (n > 1 && !result.contains(n)) {
            result.add(n);
        }
        return result;
    }
}