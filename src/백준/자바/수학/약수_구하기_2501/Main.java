package 백준.자바.수학.약수_구하기_2501;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K)
                    System.out.println(i);
            }
        }
        if (count < K) {
            System.out.println(0);
        }
    }
}