package 프로그래머스.자바.Lv_1.예산;

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (budget < d[i]) break;
            budget -= d[i];
            answer++;
        }
        return answer;
    }
}