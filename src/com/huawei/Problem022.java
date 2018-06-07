package com.huawei;

import java.util.Scanner;

/* ÆûË®Æ¿*/
public class Problem022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) break;
            int ret = 0;
            int a = 0, b = 0;
            while (num >= 3) {
                a = num / 3;
                b = num % 3;
                ret += a;
                num = a + b;
            }
            if (num == 2)
                System.out.println(ret + 1);
            else
                System.out.println(ret);
        }
    }
}
