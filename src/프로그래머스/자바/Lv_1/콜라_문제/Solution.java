package 프로그래머스.자바.Lv_1.콜라_문제;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            answer += (n/a) * b;
            n = (n/a) * b + (n%a);
        }
        return answer;
    }
}