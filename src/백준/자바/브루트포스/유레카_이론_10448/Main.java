package 백준.자바.브루트포스.유레카_이론_10448;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] ans = new int[45];
        for (int i = 1; i < 45; i++) {
            ans[i] = i * (i + 1) / 2;
        }

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int result = eureka(K, ans);
            System.out.println(result);
        }
    }

    static int eureka(int T, int[] ans) {
        for (int i = 1; i < 45; i++) {
            for (int j = 1; j < 45; j++) {
                for (int k = 1; k < 45; k++) {
                    int sum = ans[i] + ans[j] + ans[k];
                    if (sum == T) return 1;
                }
            }
        }
        return 0;
    }
}
