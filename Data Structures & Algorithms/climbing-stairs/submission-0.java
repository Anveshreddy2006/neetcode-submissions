class Solution {
    public static int solve(int n){
        if(n==1) return 1;
        if(n==2) return 2;

        return solve(n-1)+solve(n-2);
    }
    public int climbStairs(int n) {
        return solve(n);
    }
}
