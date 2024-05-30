package 프로그래머스.자바.Lv_1.핸드폰_번호_가리기;

class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);

        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.setCharAt(i, '*');
        }
        return sb.toString();
    }
}
