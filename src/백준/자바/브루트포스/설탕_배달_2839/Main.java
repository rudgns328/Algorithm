package 백준.자바.브루트포스.설탕_배달_2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N % 5 == 0) {
            System.out.println(N / 5);
        } else if (N == 9) {
            System.out.println(3);
        } else if (N == 7) {
            System.out.println(-1);
        } else if (N % 5 == 1) {
            System.out.println((N / 5 - 1) + (N % 5 + 5) / 3);
        } else if (N % 5 == 2) {
            System.out.println((N / 5 - 2) + (N % 5 + 10) / 3);
        } else if (N % 5 == 3) {
            System.out.println((N / 5) + ((N % 5) / 3));
        } else if (N % 5 == 4) {
            if (N / 5 > 1) {
                System.out.println((N / 5 - 1) + (N % 5 + 5) / 3);
            } else System.out.println(-1);
        } else System.out.println(-1);
    }
}

