package 프로그래머스.자바.Lv_1.크기가_작은_부분_문자열;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String a = t.substring(i, i + p.length());
            if (Long.parseLong(a) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}