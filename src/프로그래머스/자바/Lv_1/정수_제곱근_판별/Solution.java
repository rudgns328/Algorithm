package 프로그래머스.자바.Lv_1.정수_제곱근_판별;

class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        long ans = 0;

        if (sqrt % 1 == 0) {
            ans = (long) Math.pow(sqrt + 1, 2);
        } else ans = -1;
        return ans;
    }
}
