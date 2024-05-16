package 백준.자바.기하학.삼각형과_세_변_5073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];


        while (true) {
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;

            Arrays.sort(arr);

            if (arr[0] + arr[1] < arr[2]) {
                System.out.println("Invalid");
            } else {
                if (arr[0] == arr[1] && arr[0] == arr[2]) {
                    System.out.println("Equilateral");
                } else if (arr[0] != arr[1] && arr[0] != arr[2]) {
                    System.out.println("Scalene");
                } else System.out.println("Isosceles");
            }
        }
    }
}
