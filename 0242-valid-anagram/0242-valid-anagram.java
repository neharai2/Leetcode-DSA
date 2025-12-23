class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] chars = s.toCharArray();  // Convert to char array
        Arrays.sort(chars);                  // Sort the array
        String s1 = new String(chars);

       char[] chars2 = t.toCharArray();  // Convert to char array
        Arrays.sort(chars2);                  // Sort the array
        String t1 = new String(chars2);


        if(s1.equals(t1)){
            return true;
        }


        return false;
    }
}