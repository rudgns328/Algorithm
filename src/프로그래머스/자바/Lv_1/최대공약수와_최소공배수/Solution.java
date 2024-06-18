package 프로그래머스.자바.Lv_1.최대공약수와_최소공배수;

class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);

        while(min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }

        int gcd = n * m / max;
        int[] answer = {max, gcd};

        return answer;
    }
}