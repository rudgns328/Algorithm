package 백준.자바.문자열.대소문자_바꾸기_2744;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 65 && arr[i] <= 90) {
                arr[i] += 32;
            } else if(arr[i] >= 97 && arr[i] <= 122) {
                arr[i] -= 32;
            }
        }
        String output = String.valueOf(arr);

        System.out.println(output);
    }
}