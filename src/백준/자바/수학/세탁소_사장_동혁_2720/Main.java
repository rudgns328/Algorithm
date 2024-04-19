package 백준.자바.수학.세탁소_사장_동혁_2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for (int i = 0; i < N; i++) {
            int C = Integer.parseInt(br.readLine());

            sb.append(C / quarter + " ");
            C %= quarter;

            sb.append(C / dime + " ");
            C %= dime;

            sb.append(C / nickel + " ");
            C %= nickel;

            sb.append(C / penny + "\n");
            C %= penny;
        }
        System.out.print(sb);

        br.close();
    }
}
