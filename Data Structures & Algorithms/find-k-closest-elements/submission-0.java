
class Solution {

static class pair{
    int num;
    int dif;
    pair(int n,int d){
        num=n;
        dif = d;
    }
}
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n  = arr.length;
        if(k>n) return new ArrayList<>();
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> {

            if (a.dif == b.dif) {
                return a.num - b.num;
            }

            return a.dif - b.dif;
        });

        for(int i:arr){
            pq.add(new pair(i,Math.abs(x-i)));
        }
     
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<k;i++){
            pair  p = pq.poll();
            ans.add(p.num);
        }
        Collections.sort(ans);
        return ans;
    }
}