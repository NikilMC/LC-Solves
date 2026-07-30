class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        if(numBottles<numExchange){
            return numBottles;
        }
        int ans=0;
        while(true){
            if(numBottles<numExchange){
                return ans+numBottles;
            }
            numBottles-=numExchange;
            ans+=numExchange;
            numExchange++;
            numBottles++;
        }
    }
}