package 백준.자바.반복문.구구단_2739;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <=9; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }
    }
}
