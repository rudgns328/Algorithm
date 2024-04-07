package 백준.자바.배열.최댓값_2562;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int num = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        for (int j = 0; j < 9; j++) {
            if (arr[j] > max) {
                max = arr[j];
                num = j + 1;
            }
        }
        System.out.println(max);
        System.out.println(num);
    }
}

