package 백준.자바.구현.노래_악보_1392;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int time = Integer.parseInt(br.readLine());

            for (int j = 0; j < time; j++) {
                list.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Q; i++) {
            int questionTime = Integer.parseInt(br.readLine());

            sb.append(list.get(questionTime)).append("\n");
        }
        System.out.print(sb);
    }
}
