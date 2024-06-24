package 프로그래머스.자바.Lv_1.완주하지_못한_선수;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[i];
    }
}
