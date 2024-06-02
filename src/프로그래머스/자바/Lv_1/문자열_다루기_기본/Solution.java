package 프로그래머스.자바.Lv_1.문자열_다루기_기본;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                answer = false;
            }
        }
        return answer;
    }
}