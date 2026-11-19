class Solution {
    public int carFleet(int t, int[] p, int[] s) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<p.length;i++){
            int re = t-p[i];
            set.add(re/s[i]);

        }
        return set.size();
    }
}
