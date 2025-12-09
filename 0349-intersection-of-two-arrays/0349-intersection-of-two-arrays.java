class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int n: nums1){
            if(!set1.contains(n)){
                set1.add(n);
            }
        }
        for(int l: nums2){
            if(set1.contains(l)){
                set2.add(l);
            }
        }

        int arr[] = new int[set2.size()];

        int i = 0;
        for(int val : set2){
            arr[i++] = val;
        }


        return arr;
    }

}