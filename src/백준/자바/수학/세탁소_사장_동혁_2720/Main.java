package 백준.자바.수학.세탁소_사장_동혁_2720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();

            quarter = a / 25;
            dime = (a % 25) / 10;
            nickel = (a % 25 % 10) / 5;
            penny = (a % 25 % 10) % 5;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
