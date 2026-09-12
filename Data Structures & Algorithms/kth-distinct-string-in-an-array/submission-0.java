class Solution {
    public String kthDistinct(String[] arr, int k) {
        int cnt =0;
        HashMap<String,Integer> map = new HashMap<>();

        for(String s: arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        ArrayList<String> a = new ArrayList<>();

        for(String s: arr){
            if(map.get(s)==1){
                a.add(s);
            }
        }
        if(a.size()<k) return "";

        return a.get(k-1);
    }
}