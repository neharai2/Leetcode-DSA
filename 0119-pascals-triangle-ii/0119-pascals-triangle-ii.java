class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            ArrayList<Integer> ans = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    ans.add(1);
                } else {
                    ans.add(arr.get(j - 1) + arr.get(j));
                }
            }
            arr = ans;  // update previous row
        }

        return arr;   // ✅ return only the required row
    }
}
  