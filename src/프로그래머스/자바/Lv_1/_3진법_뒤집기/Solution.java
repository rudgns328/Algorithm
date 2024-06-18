package 프로그래머스.자바.Lv_1._3진법_뒤집기;

class Solution {
    public int solution(int n) {
        String three = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(three);
        String ans = String.valueOf(sb.reverse());

        int answer = Integer.parseInt(ans, 3);


        return answer;
    }
}