package 백준.자바.문자열.팰린드롬인지_확인하기_10988;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();

        if (str.equals(reverse)) {
            System.out.println(1);
        } else System.out.println(0);
    }
}
