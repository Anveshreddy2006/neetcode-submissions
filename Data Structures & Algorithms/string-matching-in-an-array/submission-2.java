class Solution {
    public List<String> stringMatching(String[] words) {
        List<String>  ans = new ArrayList<>();
        int n = words.length;
HashSet<String> set = new HashSet<>();

        for(int i=0;i<n;i++) {

            for(int j=0;j<n;j++){
                if(i==j) continue;

                if(words[i].indexOf(words[j])!=-1){

                    if(!set.contains(words[j])){
                       set.add(words[j]);
                    }
                   
                }
            }
        }
        for(String s : set){
            ans.add(s);
        }
        return ans;

    }
}