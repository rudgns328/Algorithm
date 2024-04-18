package 백준.자바.수학.진법_변환_2745;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();
        int ten = 0;
        long ans = 0;
        int idx = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                ten = str.charAt(i) - '0';
            } else ten = str.charAt(i) - 55;
            ans += ten * Math.pow(N, idx++);
        }
        System.out.println(ans);
    }
}
