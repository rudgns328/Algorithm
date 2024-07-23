package SWEA.자바.D3.햄버거_다이어트_5215;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int L = sc.nextInt();

            int[] scores = new int[N];
            int[] calories = new int[N];

            for (int i = 0; i < N; i++) {
                scores[i] = sc.nextInt();
                calories[i] = sc.nextInt();
            }

            int[] dp = new int[L + 1];

            for (int i = 0; i < N; i++) {
                for (int j = L; j >= calories[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - calories[i]] + scores[i]);
                }
            }

            int maxScore = 0;
            for (int j = 0; j <= L; j++) {
                if (dp[j] > maxScore) {
                    maxScore = dp[j];
                }
            }
            System.out.printf("#%d %d\n", test_case, maxScore);
        }
    }
}
