class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length];
        Arrays.fill(dp,-1);

        return helper(days, costs, dp, 0);
    }

    private int helper(int[] days, int[] costs, int[] dp, int idx){
        if(idx >= days.length){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int val = costs[0] + helper(days, costs, dp, idx+1);

        for(int i = 1;i < 3;i++){
            val = Math.min(val, costs[i] + helper(days, costs, dp, (i == 1) ? ub(days,days[idx]+6) : ub(days,days[idx]+29)));
        }

        return dp[idx] = val;
    }

    private int ub(int[] days, int target){
        if(target >= days[days.length-1]){
            return days.length;
        }
        int lo = 0, hi = days.length-1;

        while(lo < hi){
            int mid = (lo + hi) / 2;

            if(days[mid] <= target){
                lo = mid+1;
            }
            else{
                hi = mid;
            }
        }

        return lo;
    }
}