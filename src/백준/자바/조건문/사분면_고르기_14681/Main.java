package 백준.자바.조건문.사분면_고르기_14681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0)
            System.out.println(1);
        else if (num1 < 0 && num2 > 0)
            System.out.println(2);
        else if (num1 < 0 && num2 < 0)
            System.out.println(3);
        else if (num1 > 0 && num2 < 0)
            System.out.println(4);
    }
}
