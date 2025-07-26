// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0){
                pos.add(arr.get(i));
            }
            else{
                neg.add(arr.get(i));
            }
        }
        int i=0,p=0,n=0;
        while(n<neg.size()&&p<pos.size()){
            arr.set(i++,pos.get(p++));
            arr.set(i++,neg.get(n++));
        }
        while(p<pos.size()){
            arr.set(i++,pos.get(p++));
        }
        while(n<neg.size()){
            arr.set(i++,neg.get(n++));
        }
    }
}