class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int min_speed = 1;
        int max_speed = piles[piles.length-1];

        while(min_speed < max_speed) {
            int mid = min_speed + ((max_speed - min_speed)/2);

            if(caneat(piles, h, mid)){
                max_speed = mid;
            }
            else{
                min_speed = mid +1;
            }
        }
        return min_speed;
        
        
    }

    private boolean caneat(int[]piles, int h, int speed){
        int hour = 0;
        
        for(int pile: piles){
            hour += (int) Math.ceil((double)pile/speed);

        }
        return hour <= h;
    }
}