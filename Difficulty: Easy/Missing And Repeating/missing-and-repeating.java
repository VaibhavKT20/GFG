class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
      int n=arr.length;
      int repeating=-1;
      int missing=-1;
      int []count=new int[n+1];
      for(int i=0;i<n;i++){
          count[arr[i]]++;
      }
      for(int i=1;i<=n;i++){
          if(count[i]==0){
              missing=i;
          }
          else if(count[i]==2){
              repeating=i;
          }
      }
    
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
        
    }
}
