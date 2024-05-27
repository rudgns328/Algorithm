package 프로그래머스.자바.Lv_1.자릿수_더하기;

import java.lang.*;

public class Solution {
    public int solution(int n) {
        String a = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < a.length(); i++) {
            sum += Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        return sum;
    }
}
