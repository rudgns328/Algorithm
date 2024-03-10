package 백준.자바.문자열.문서_검색_1543;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String newStr = str1.replace(str2, "");

        int length = str1.length() - newStr.length();
        int count = length / str2.length();

        System.out.println(count);
    }
}
