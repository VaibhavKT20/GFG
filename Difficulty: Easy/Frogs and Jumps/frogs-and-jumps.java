// User function Template for Java

class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        boolean []visited=new boolean[leaves+1];
        
        Set<Integer> seen=new HashSet<>();
        
        for(int i=0;i<N;i++){
            int strength=frogs[i];
            
            if(strength==0|| strength> leaves || seen.contains(strength)){
                continue;
            }
            seen.add(strength);
            
            for(int j=0;j<=leaves;j+=strength){
                visited[j]=true;
            }
        }
        
        int count=0;
        for(int i=0;i<=leaves;i++){
            if(!visited[i]){
                count++;
            }
        }
        return count;
        
    }
}
