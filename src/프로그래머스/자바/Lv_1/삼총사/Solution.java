package 프로그래머스.자바.Lv_1.삼총사;

class Solution {
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i; j < number.length - 2; j++) {
                for (int k = j; k < number.length - 2; k++) {
                    if (number[i] + number[j + 1] + number[k + 2] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}