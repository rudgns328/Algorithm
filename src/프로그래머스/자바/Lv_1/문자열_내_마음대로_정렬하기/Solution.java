package 프로그래머스.자바.Lv_1.문자열_내_마음대로_정렬하기;

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();

        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}