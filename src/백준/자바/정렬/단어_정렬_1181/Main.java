package 백준.자바.정렬.단어_정렬_1181;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.nextLine();

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr, (String s1, String s2) -> {
            if (s1.length() == s2.length()) {
                return s1.charAt(0) - s2.charAt(0);
            } else return s1.length() - s2.length();
        });

        System.out.println(arr[0]);

        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }
    }
}
