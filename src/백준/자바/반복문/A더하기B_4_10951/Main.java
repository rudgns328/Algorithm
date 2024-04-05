package 백준.자바.반복문.A더하기B_4_10951;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);

        while(in.hasNextInt()){

            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(a+b);

        }
        in.close();
    }
}
