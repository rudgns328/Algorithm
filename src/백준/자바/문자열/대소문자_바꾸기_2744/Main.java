package 백준.자바.문자열.대소문자_바꾸기_2744;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] arr = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if ('a' <= arr[i] && arr[i] <= 'z')
                arr[i] = (char)('A' + arr[i] - 'a');
            else arr[i] = (char)('a' + arr[i] - 'A');
        }
        System.out.println(arr);
    }
}