package 백준.자바.시간복잡도.알고리즘_수업_알고리즘의_수행_시간_3_24264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        br.close();
        System.out.println(n*n);
        System.out.println(2);
    }
}