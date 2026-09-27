class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int n = strs.length;
   HashMap<String,ArrayList<String>> map = new HashMap<>();

   for(int i=0;i<n;i++){

        
    String s2 = strs[i];
     char[] c2 = s2.toCharArray();
     Arrays.sort(c2);
     String ns2 = new String(c2);
     if(!map.containsKey(ns2)){
        map.put(ns2, new ArrayList<>());
     } 
     map.get(ns2).add(s2);
        

    }

    for(ArrayList<String> e : map.values()){
        ans.add(e);
    }
    return ans;
   

    }
}
