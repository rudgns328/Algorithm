package 백준.자바.배열.줄세우기_10431;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();

        while (P-- > 0) {
            int T = sc.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++)
                h[i] = sc.nextInt();

            int cnt = 0;
            int[] sorted = new int[20];
            for (int i = 0; i < 20; i++) {
                boolean find = false;
                for (int j = 0; j < i; j++)
                    if (sorted[j] > h[i]) {
                        find = true;

                        for (int k = i - 1; k >= j; k--) {
                            sorted[k + 1] = sorted[k];
                            cnt ++;
                        }
                        sorted[j] = h[i];
                        break;
                    }
                if (!find) sorted[i] = h[i];
            }
            System.out.println(T + " " + cnt);
        }
    }
}