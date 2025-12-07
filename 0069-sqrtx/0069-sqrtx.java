class Solution {
    public int mySqrt(int x) {

        int start = 1;
        int end = x;
        int answer = 0;
        int mid = 0;

        if(x == 0 || x == 1){
            return x;
        }

        while(start <= end){
            mid = start + ((end - start)/2);

            if(mid <= x/mid){
                answer = mid;
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
            
        }
        return answer;
    }
}