package 백준.자바.수학.정수_제곱근_2417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long q = (long) Math.sqrt(n);

        if ((q * q) < n) q++;
        System.out.println(q);
    }
}
