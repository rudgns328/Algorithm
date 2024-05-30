package 프로그래머스.자바.Lv_1.없는_숫자_더하기;

class Solution {
    public int solution(int[] numbers) {
        int sum = 45;

        for (int i = 0; i < numbers.length; i++) {
            sum -= numbers[i];
        }

        return sum;
    }
}
