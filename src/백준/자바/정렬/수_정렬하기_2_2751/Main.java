package 백준.자바.정렬.수_정렬하기_2_2751;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        Collections.sort(list);

        for (int value : list) {
            sb.append(value).append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
