package 백준.자바.배열.세로읽기_10798;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];

        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == '\0')
                    continue;
                System.out.print(arr[j][i]);
            }
        }
    }
}
