package 백준.자바.정렬.수_정렬하기_3_10989;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[10001];

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        for (int i = 1; i <= 10000; i++) {
            while (cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }

        System.out.println(sb);
    }
}
