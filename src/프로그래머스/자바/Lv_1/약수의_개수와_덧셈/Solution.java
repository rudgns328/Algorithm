package 프로그래머스.자바.Lv_1.약수의_개수와_덧셈;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            } else answer += i;
        }

        return answer;
    }
}
