package 프로그래머스.자바.Lv_1.문자열_내림차순으로_배치하기;

import java.util.*;

class Solution {
    public String solution(String s) {
        String[] list = s.split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) {
            sb.append(aList);
        }
        return String.valueOf(sb.reverse());
    }
}
