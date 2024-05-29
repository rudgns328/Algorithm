package 프로그래머스.자바.Lv_1.x만큼_간격이_있는_n개의_숫자;

class Solution {
    public long[] solution(int x, int n) {
        long[] list = new long[n];
        list[0] = x;
        for (int i = 1; i < n; i++) {
            list[i] = list[i - 1] + x;
        }
        return list;
    }
}