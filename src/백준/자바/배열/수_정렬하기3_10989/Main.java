package 백준.자바.배열.수_정렬하기3_10989;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] cnt = new int[10001];
        for (int i = 0; i < N; i++)
            cnt[Integer.parseInt(br.readLine())]++;

        for (int i = 0; i <= 10000; i++)
            while (cnt[i]-- > 0) {
                bw.write(i + "\n");
            }

        br.close();
        bw.flush();
        bw.close();
    }
}
