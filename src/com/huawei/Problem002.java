package com.huawei;

import java.util.Scanner;

/* ¼ÆËã×Ö·û¸öÊý*/
public class Problem002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine().toUpperCase();
            String res = sc.nextLine().toUpperCase();

            char[] chars = str.toCharArray();
            char ch = res.toCharArray()[0];
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch) count++;
            }
            System.out.println(count);
        }
    }
}
