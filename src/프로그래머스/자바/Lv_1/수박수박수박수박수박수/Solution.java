package 프로그래머스.자바.Lv_1.수박수박수박수박수박수;

class Solution {
    public String solution(int n) {
        StringBuffer sb = new StringBuffer();
        String str = "수박";

        String answer = "";

        if (n == 1) answer = "수";

        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                sb.append(str);
            }
        } else {
            for (int j = 0; j < n; j++) {
                sb.append(str);
            }
            for (int k = sb.length() - 1; k >= n; k--) {
                sb.deleteCharAt(k);
            }
        }

        answer = String.valueOf(sb);
        return answer;
    }
}
