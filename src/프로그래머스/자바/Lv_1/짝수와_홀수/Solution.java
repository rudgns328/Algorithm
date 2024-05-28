package 프로그래머스.자바.Lv_1.짝수와_홀수;

class Solution {
    public String solution(int num) {
        String ans = "";
        if (num % 2 == 0) ans = "Even";
        else ans = "Odd";

        return ans;
    }
}
