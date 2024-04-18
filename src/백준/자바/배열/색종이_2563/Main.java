package 백준.자바.배열.색종이_2563;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[100][100];
        int X = 0;
        int Y = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());

            for (int j = X; j < X + 10; j++) {
                for (int k = Y; k < Y + 10; k++) {
                    if (arr[j][k] == false) {
                        arr[j][k] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

