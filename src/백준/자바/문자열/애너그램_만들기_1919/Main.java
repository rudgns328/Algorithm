package 백준.자바.문자열.애너그램_만들기_1919;

import java.util.Scanner;

public class Main {

    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i) - 'a']++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int[] countA = getAlphabetCount(str1);
        int[] countB = getAlphabetCount(str2);

        int answer = 0;

        for (int i = 0; i < 26; i++)
            answer += Math.abs(countA[i] - countB[i]);

        System.out.print(answer);
    }
}
