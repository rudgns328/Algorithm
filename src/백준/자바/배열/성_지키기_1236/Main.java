package 백준.자바.배열.성_지키기_1236;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] map = new char[N][M];

        for (int i = 0; i < N; i++) {
            map[i] = sc.next().toCharArray();
        }

        int existRowCount = 0;
        for (int i = 0; i < N; i++) {
            boolean exist = false;
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    exist = true;
                    break;
                }
            }
            if (exist) existRowCount++;
        }

        int existColCount = 0;
        for (int j = 0; j < M; j++) {
            boolean exist = false;
            for (int i = 0; i < N; i++) {
                if (map[i][j] == 'X') {
                    exist = true;
                    break;
                }
            }
            if (exist) existColCount++;
        }

        int needRowCount = N - existRowCount;
        int needColCount = M - existColCount;

        System.out.println(Math.max(needRowCount, needColCount));
    }
}
