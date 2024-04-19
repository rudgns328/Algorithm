package 백준.자바.수학.중앙_이동_알고리즘_2903;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = (int)Math.pow((Math.pow(2, N) + 1), 2);
        System.out.println(ans);
        br.close();
    }
}
