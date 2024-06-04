package 프로그래머스.자바.Lv_1._3진법_뒤집기;

class Solution {
    public int solution(int n) {
        String str = "";

        while (n != 0) {
            str += n % 3;
            n /= 3;
        }

        return Integer.parseInt(str, 3);
    }
}
