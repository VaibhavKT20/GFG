class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }
        char []arrs1=s1.toCharArray();
        char []arrs2=s2.toCharArray();
        Arrays.sort(arrs1);
        Arrays.sort(arrs2);
        int indexs1=0;
        int indexs2=0;
        int len=arrs1.length;
        while(indexs1<len &&indexs2<len){
            if(arrs1[indexs1]!=arrs2[indexs2]){
                return false;
            }
            indexs1++;
            indexs2++;
        }
        return true;
        
    }
}