// User function Template for Java

class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
        long sum=0;
        if(date%2!=0){
            for(int i=0;i<car.length;i++){
                if(car[i]%2==0){
                  sum+=fine[i];  
                }
            }
        }
        else{
            for(int i=0;i<car.length;i++){
                if(car[i]%2!=0){
                    sum+=fine[i];
                }
            }
        }
        return sum;
        
    }
}