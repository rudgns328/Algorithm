package 백준.자바.시간복잡도.개미_10158;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int T = sc.nextInt();

        int currentX = (P + T) % (2 * W);
        int currentY = (Q + T) % (2 * H);
        if (currentX > W)
            currentX = 2 * W - currentX;
        if (currentY > H)
            currentY = 2 * H - currentY;

        System.out.println(currentX + " " + currentY);
    }
}