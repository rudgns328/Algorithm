package 백준.자바.문자열.단어의_개수_1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());
    }
}