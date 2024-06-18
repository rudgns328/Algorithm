package 프로그래머스.자바.Lv_1.같은_숫자는_싫어;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int value = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                list.add(arr[i]);
                value = arr[i];
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}