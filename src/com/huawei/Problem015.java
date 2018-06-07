package com.huawei;

import java.util.Scanner;

/* 求int型正整数在内存中存储时1的个数*/
public class Problem015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            int count = 0;
            while (num != 0) {
                if ((num & 1) != 0) {
                    count++;
                }
                num = num >>> 1;
            }
            System.out.println(count);
        }
    }
}
