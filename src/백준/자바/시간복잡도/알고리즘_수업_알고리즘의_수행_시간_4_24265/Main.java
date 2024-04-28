package 백준.자바.시간복잡도.알고리즘_수업_알고리즘의_수행_시간_4_24265;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = 1; i <= n-1; i++){
            for(int j = i+1;  j <= n; j++){
                count++;
            }
        }

        System.out.println(count);

    }
}