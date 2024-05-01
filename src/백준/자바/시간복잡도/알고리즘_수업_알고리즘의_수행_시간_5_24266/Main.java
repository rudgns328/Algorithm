package 백준.자바.시간복잡도.알고리즘_수업_알고리즘의_수행_시간_5_24266;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        br.close();

        int count = 0; //수행 홧수 저장하는 변수

        for(int i  = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
