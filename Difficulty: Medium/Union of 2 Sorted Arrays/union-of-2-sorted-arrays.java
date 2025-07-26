class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        Set<Integer> res=new TreeSet<>();
        for(int i=0;i<a.length;i++){
            res.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            res.add(b[i]);
        }
        return new ArrayList<>(res);
    }
}
