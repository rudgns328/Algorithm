package SWEA.자바.D3.원재의_메모리_복구하기_1289;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        String memory;
        char bit;
        int ans = 0;

        for(int i = 1; i <= T; i++) {
            memory = sc.next();
            bit = '0';
            for (int j = 0; j < memory.length(); j++) {
                if (bit != memory.charAt(j)) {
                    bit = memory.charAt(j);
                    ans++;
                }
            }
            System.out.printf("#%d %d\n", i, ans);
        }
    }
}
