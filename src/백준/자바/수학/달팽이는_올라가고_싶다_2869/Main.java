package 백준.자바.수학.달팽이는_올라가고_싶다_2869;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int up = in.nextInt();		// A
        int down = in.nextInt();	// B
        int length = in.nextInt(); 	// C

        int day = (length - down) / (up - down);

        // 나머지가 있을 경우 (잔여 블럭이 있을 경우)
        if ((length - down) % (up - down) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
