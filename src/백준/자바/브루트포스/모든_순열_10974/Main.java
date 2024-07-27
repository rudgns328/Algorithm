package 백준.자바.브루트포스.모든_순열_10974;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] num;
    static boolean[] used;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        num = new int[N];
        used = new boolean[N];

        perm(0);
        System.out.println(sb.toString());
    }

    static void perm(int idx) {
        if (idx == N) {
            for (int i = 0; i < N; i++) {
                sb.append(num[i] + " ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (used[i]) continue;

            num[idx] = i + 1;
            used[i] = true;
            perm(idx + 1);
            used[i] = false;
        }
    }
}
