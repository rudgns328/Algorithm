package 백준.자바.기하학.네_번째_점_3009;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = { sc.nextInt(), sc.nextInt() };
        int[] B = { sc.nextInt(), sc.nextInt() };
        int[] C = { sc.nextInt(), sc.nextInt() };
        int X = 0;
        int Y = 0;

        if (A[0] == B[0]) {
            X = C[0];
        } else if (A[0] == C[0]) {
            X = B[0];
        } else X = A[0];

        if (A[1] == B[1]) {
            Y = C[1];
        } else if (A[1] == C[1]) {
            Y = B[1];
        } else Y = A[1];

        System.out.println(X + " " + Y);
    }
}
