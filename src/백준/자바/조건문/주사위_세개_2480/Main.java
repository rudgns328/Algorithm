package 백준.자바.조건문.주사위_세개_2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (arr[0] == arr[1] && arr[0] == arr[2]) {
            int ans = 10000 + arr[0] * 1000;
            System.out.println(ans);
        } else if (arr[0] == arr[1] || arr[0] == arr[2]) {
            int ans = 1000 + arr[0] * 100;
            System.out.println(ans);
        } else if (arr[1] == arr[2]) {
            int ans = 1000 + arr[1] * 100;
            System.out.println(ans);
        } else if (arr[0] != arr[1] && arr[0] != arr[2] && arr[1] != arr[2]) {
            int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
            int ans = max * 100;
            System.out.println(ans);
        }
    }
}
