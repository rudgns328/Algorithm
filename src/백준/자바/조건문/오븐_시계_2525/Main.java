package 백준.자바.조건문.오븐_시계_2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] currentTime = sc.nextLine().split(" ");
        int currentHour = Integer.parseInt(currentTime[0]);
        int currentMinute = Integer.parseInt(currentTime[1]);
        int currentMinuteAmount = currentHour * 60 + currentMinute;

        int needTime = sc.nextInt();

        int answerTime = currentMinuteAmount + needTime;
        if (answerTime >= 1440)
            answerTime -= 1440;

        int answerHour = answerTime / 60;
        int answerMinute = answerTime % 60;

        System.out.println(answerHour + " " + answerMinute);
    }
}
