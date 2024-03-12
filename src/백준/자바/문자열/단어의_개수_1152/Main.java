package 백준.자바.문자열.단어의_개수_1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        if (str.charAt(0) != ' ' && str.charAt(str.length() - 1) != ' ') {
            count += 1;
        } else if (str.charAt(0) == ' ' && str.charAt(str.length() - 1) == ' ') {
            count -= 1;
        }
        System.out.println(count);
    }
}