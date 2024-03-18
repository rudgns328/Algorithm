package 백준.자바.조건문.알람_시계_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split(" ");

        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);

        int newTime = hour * 60 + minute;

        int answerTime = newTime - 45;
        if (answerTime < 0)
            answerTime += 1440;

        int answerHour = answerTime / 60;
        int answerMinute = answerTime % 60;

        System.out.printf("%d %d", answerHour, answerMinute);
    }
}
