package 백준.자바.배열.바구니_뒤집기_10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int LEFT = Integer.parseInt(st.nextToken()) - 1;
            int RIGHT = Integer.parseInt(st.nextToken()) - 1;

            while (LEFT < RIGHT) {
                int tmp = arr[LEFT];
                arr[LEFT++] = arr[RIGHT];
                arr[RIGHT--] = tmp;
            }
        }
        br.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}