package com.huawei;

import java.util.Scanner;

/* ×Ö·û´®·Ö¸î*/
public class Problem004 {
    private static String[] zeros = new String[] {"", "0", "00", "000", "0000", "00000", "000000", "0000000"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            print(str1);
            print(str2);
        }
    }

    private static void print(String str) {
        int n = str.length() / 8;
        int mod = str.length() % 8;

        for (int i = 0; i < n; i++) {
            System.out.println(str.substring(8 * i, 8 * (i + 1)));
        }
        if (mod != 0) {
            System.out.print(str.substring(8 * n, str.length()));
            System.out.println(zeros[8 - mod]);
        }
    }
}
