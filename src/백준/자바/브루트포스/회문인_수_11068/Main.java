package 백준.자바.브루트포스.회문인_수_11068;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            long N = Long.parseLong(br.readLine());

            System.out.println(transformation(N));
        }
        br.close();
    }

    static int transformation(long num) {
        for (int i = 2; i <= 64; i++) {
            String numStr = Long.toString(num, i);

            if (isPalindrome(numStr)) {
                return 1;
            }
        }
        return 0;
    }

    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
