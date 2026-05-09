class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> ans = new HashMap<>();

        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String p = new String(c);

            if(!ans.containsKey(p)){
                ans.put(p, new ArrayList<>());
            }
            ans.get(p).add(s);
        }

        return new ArrayList<>(ans.values());
        
    }
}