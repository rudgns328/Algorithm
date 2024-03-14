package 백준.자바.문자열.그대로_출력하기_11718;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(str);
        }
        sc.close();
    }
}
