package 백준.자바.배열.두_수의_합_3273;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int X = Integer.parseInt(br.readLine());
        int start = 0;
        int end = N - 1;
        int sum = 0;
        int count = 0;

        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum < X) {
                start++;
            } else if (sum > X) {
                end--;
            } else {
                count++;
                start++;
                end--;
            }
        }
        System.out.println(count);
    }
}
