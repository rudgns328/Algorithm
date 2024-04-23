package 백준.자바.수학.약수들의_합_9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringBuilder sb = new StringBuilder();
            int sum = 1;
            int N = Integer.parseInt(br.readLine());
            if (N == -1) break;

            sb.append(N + " = 1");
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    sb.append(" + " + i);
                    sum += i;
                }
            }

            if (sum != N) {
                System.out.println(N + " is NOT perfect.");
            } else System.out.println(sb);
        }
    }
}
