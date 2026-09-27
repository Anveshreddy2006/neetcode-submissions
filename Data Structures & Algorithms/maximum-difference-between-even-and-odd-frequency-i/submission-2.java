class Solution {
    public int maxDifference(String s) {
        int mino = Integer.MAX_VALUE;
        int mine = Integer.MAX_VALUE;
        int maxe = Integer.MIN_VALUE;
        int maxo = Integer.MIN_VALUE;
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
            
        }

        for(int i=0;i<26;i++){
              if (freq[i] == 0) continue; 
            if(freq[i]%2==0){
                mine = Math.min(mine,freq[i]);
                
                maxe = Math.max(maxe,freq[i]);
            }else{
                mino = Math.min(mino,freq[i]);
                
                maxo = Math.max(maxo,freq[i]);
            }
        }

        return Math.max(mino-maxe,maxo-mine);
    }
}