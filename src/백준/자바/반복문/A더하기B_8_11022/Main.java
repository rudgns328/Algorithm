package 백준.자바.반복문.A더하기B_8_11022;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = in.nextInt();
            int B = in.nextInt();

            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
        }

        in.close();
    }
}