package 프로그래머스.자바.Lv_1.부족한_금액_계산하기;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }

        if (money - sum >= 0) {
            answer = 0;
        } else answer = Math.abs(money - sum);

        return answer;
    }
}