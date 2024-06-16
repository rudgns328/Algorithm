package 프로그래머스.자바.Lv_1._2016년;

class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int total = 0; // 총 일수

        for(int i=0; i<a; i++) {
            total += months[i];
        }
        total += b;

        return days[(total + 4) % 7];
    }
}