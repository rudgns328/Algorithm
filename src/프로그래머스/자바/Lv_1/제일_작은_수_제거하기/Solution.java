package 프로그래머스.자바.Lv_1.제일_작은_수_제거하기;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if (arr.length == 1) {
            answer = new int[] {-1};
        } else {
            List<Integer> list = new ArrayList<>();
            for (int a : arr) {
                list.add(a);
            }

            list.remove(Collections.min(list));
            answer = new int[arr.length - 1];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}