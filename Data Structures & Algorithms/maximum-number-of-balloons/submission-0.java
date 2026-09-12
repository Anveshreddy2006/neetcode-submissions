class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        for(char c : text.toCharArray()){
            if(c=='b' || c=='a' || c=='o' || c=='l'||c=='n'){
                freq[c-'a']++;
            }
        }

        int min = Math.min(freq[0],Math.min(freq[1],freq[13]));
        int max = Math.min(freq[14],freq[11]);
        int ans = 0;
        for(int i=min;i>=0;i--){
            if(max>=2*i){
                ans = i;
                break;
            }
        }
        return ans;
    }
}