package 프로그래머스.자바.Lv_1.문자열_내_p와_y의_개수;

class Solution {
    boolean solution(String s) {
        String[] arr = s.toLowerCase().split("");
        int countP = 0;
        int countY = 0;

        for (int i = 0; i < arr.length; i++) {
            if ("p".equals(arr[i])) {
                countP++;
            } else if ("y".equals(arr[i])) {
                countY++;
            }
        }

        if (countP != countY) {
            return false;
        } return true;
    }
}
