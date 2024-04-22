package 백준.자바.수학.분수찾기_1193;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cross_count = 1;
        int prev_count_sum = 0;

        while(true) {
            if (N <= prev_count_sum + cross_count) {
                if (cross_count % 2 == 1) {
                    System.out.println((cross_count - (N - prev_count_sum - 1)) + "/" + (N - prev_count_sum));
                    break;
                } else {
                    System.out.println((N - prev_count_sum) + "/" + (cross_count - (N - prev_count_sum - 1)));
                    break;
                }
            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}
