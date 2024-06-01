package 프로그래머스.자바.Lv_1.가운데_글자_가져오기;

import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        if (s.length() % 2 == 0) {
            sb.append(s.charAt(s.length()/2 - 1));
            sb.append(s.charAt(s.length()/2));
        } else {
            sb.append(s.charAt(s.length()/2));
        }
        return sb.toString();
    }
}
