class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int [] freq= new int [26];
        int [] freqw=new int[26];
        for (char ch : s1.toCharArray()){
            freq[ch-'a']++;
        }
        int left=0;
        int right=left+s1.length()-1;
        for(int i=left;i<right+1;i++){
                char ch=s2.charAt(i);
                freqw[ch-'a']++;
            }
        if(Arrays.equals(freqw,freq)){
                return true;
            }

        while(right<s2.length()-1){
            right++;
            freqw[s2.charAt(right)-'a']++;
            freqw[s2.charAt(left)-'a']--;
            left++;
            if(Arrays.equals(freqw,freq)){
                return true;
            }            
        }
        return false;
    }
}