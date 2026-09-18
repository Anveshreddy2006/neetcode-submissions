class Solution {
    public String customSortString(String order, String s) {
        HashSet<Character> set = new HashSet<>();

        for(char ch : order.toCharArray()){
            set.add(ch);
        }

        HashMap<Character,Integer> map =new HashMap<>();
StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
            map.put(ch,map.getOrDefault(ch,0)+1);
            }else{
                sb.append(ch);
            }
        }
StringBuilder ans = new StringBuilder();

for(char ch :order.toCharArray()){
    if(map.containsKey(ch)){
        int si = map.get(ch);
        for(int j=0;j<si;j++){
            ans.append(ch);
        }
    }
}


ans.append(sb);
return ans.toString();
    }
}