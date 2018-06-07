package com.huawei;
import java.util.Scanner;

public class Problem001 {
    public static int countLastLength(String str) {
        String[] result = str.split(" ");
        return result[result.length - 1].length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            System.out.println(countLastLength(sc.nextLine()));
        }
    }

}
