package 백준.자바.문자열.크로아티아_알파벳_2941;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "c=";
        String str2 = "c-";
        String str3 = "dz=";
        String str4 = "d-";
        String str5 = "lj";
        String str6 = "nj";
        String str7 = "s=";
        String str8 = "z=";

        String newStr = str.replace(str1, "a");
        String newStr1 = newStr.replace(str2, "a");
        String newStr2 = newStr1.replace(str3, "a");
        String newStr3 = newStr2.replace(str4, "a");
        String newStr4 = newStr3.replace(str5, "a");
        String newStr5 = newStr4.replace(str6, "a");
        String newStr6 = newStr5.replace(str7, "a");
        String newStr7 = newStr6.replace(str8, "a");

        System.out.println(newStr7.length());
    }
}
