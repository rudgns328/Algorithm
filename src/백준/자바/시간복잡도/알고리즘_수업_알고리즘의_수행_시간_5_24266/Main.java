package 백준.자바.시간복잡도.알고리즘_수업_알고리즘의_수행_시간_5_24266;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        br.close();

        bw.write(n*n*n + "\n" + 3);
        bw.flush();
        bw.close();
    }
}
