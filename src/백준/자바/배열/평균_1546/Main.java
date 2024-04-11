package 백준.자바.배열.평균_1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (double) score[i] / max * 100;
        }

        double ans = sum / N;
        System.out.println(ans);
    }
}
