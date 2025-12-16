class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> result = new ArrayList<>();

        // Array to store the previous iteration value
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> ans = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i){
                    ans.add(1);
                }else{
                    // Sum of two numbers directly above
                    ans.add(arr.get(j-1) + arr.get(j));
                }
            }
            // Update prev array to current array for next iteration
            arr = (ArrayList<Integer>) ans;
            result.add(ans);
        }
        return result;
    }
}
