package 백준.자바.배열.세로읽기_10798;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] str = new char[5][15];

        String input = "";
        for (int i = 0; i < str.length; i++) {
            input = sc.next();
            // 15개 문자 넣기
            for (int j = 0; j < input.length(); j++) {
                str[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (str[j][i] == '\0')
                    continue;
                System.out.print(str[j][i]);

            }
        }
    }
}
