package 백준.자바.반복문.A더하기B_7_11021;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for (int i = 1; i <= a; i++) {
            int c = in.nextInt();
            int d = in.nextInt();

            System.out.println("Case #" + i + ": " + (c + d));
        }

        in.close();
    }
}