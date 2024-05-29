package 프로그래머스.자바.Lv_1.두_정수_사이의_합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        for (long i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}
