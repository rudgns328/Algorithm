package 백준.자바.수학.벌집_2292;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int range = 2;
        int count = 1;

        while(range <= N) {
            if (N == 1)
                System.out.println(1);
            else {
                range = range + (6 * count);
                count++;
            }
        }
        System.out.println(count);
    }
}
