package 백준.자바.문자열.소금_폭탄_13223;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] currentTime = sc.next().split(":");
        String[] dropTime = sc.next().split(":");

        int currentHour = Integer.parseInt(currentTime[0]);
        int currentMinute = Integer.parseInt(currentTime[1]);
        int currentSecond = Integer.parseInt(currentTime[2]);
        int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;

        int dropHour = Integer.parseInt(dropTime[0]);
        int dropMinute = Integer.parseInt(dropTime[1]);
        int dropSecond = Integer.parseInt(dropTime[2]);
        int dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond;

        int needSecondAmount = dropSecondAmount - currentSecondAmount;
        if (needSecondAmount <= 0)
            needSecondAmount += 24 * 3600;

        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60;
        int needSecond = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }
}
