package 프로그래머스.자바.Lv_1.하샤드_수;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] list = String.valueOf(x).split("");
        int sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum += Integer.parseInt(list[i]);
        }

        if (x % sum == 0) answer = true;
        else answer = false;

        return answer;
    }
}
