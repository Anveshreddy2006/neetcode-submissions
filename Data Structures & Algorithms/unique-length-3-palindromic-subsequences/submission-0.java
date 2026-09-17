class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> f = new HashMap<>();
                HashMap<Character,Integer> se = new HashMap<>();

                for(int i=0;i<s.length();i++){
                    char ch = s.charAt(i);

                    if(!f.containsKey(ch)){
                        f.put(ch,i);
                    }

                    se.put(ch,i);
                }


                int cnt =0;
                for(char ch:f.keySet()){
                    int le = f.get(ch);
                    int r = se.get(ch);

                    if(r-le<2) continue;

                    HashSet<Character> set = new HashSet<>();


                    for(int i=le+1;i<r;i++){
                        set.add(s.charAt(i));
                    }


                    cnt+= set.size();
                }
                return cnt;

    }
}