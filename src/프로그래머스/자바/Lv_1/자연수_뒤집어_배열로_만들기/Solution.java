package 프로그래머스.Lv_1.자연수_뒤집어_배열로_만들기;

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        String[] sArr = sb.toString().split("");

        int[] arr = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            arr[i] = Integer.parseInt(sArr[i]);
        }
        return arr;
    }
}