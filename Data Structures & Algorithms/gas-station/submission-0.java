class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
         int tc =0;
        int tg = 0;

        for(int i=0;i<gas.length;i++){
            tc+=cost[i];
            tg+=gas[i];
        }
        if(tg<tc) return -1;

        int c =0;
        int s =0;
        for(int i=0;i<gas.length;i++){
            c+=gas[i]-cost[i];
            if(c<0){
                c = 0;
                s = i+1;
            }
        }
        return s;
    }
}
