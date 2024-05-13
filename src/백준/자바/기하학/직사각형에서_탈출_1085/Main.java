package 백준.자바.기하학.직사각형에서_탈출_1085;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        int A = Math.min(Math.abs(x - w), Math.abs(x));
        int B = Math.min(Math.abs(y - h), Math.abs(y));

        System.out.println(Math.min(A, B));
    }
}
