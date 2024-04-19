package 백준.자바.수학.진법_변환_2745;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();

        System.out.println(Integer.parseInt(str, N));
    }
}
