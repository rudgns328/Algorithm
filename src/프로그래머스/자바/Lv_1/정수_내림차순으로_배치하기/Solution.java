package 프로그래머스.자바.Lv_1.정수_내림차순으로_배치하기;

import java.util.*;

class Solution {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }
}