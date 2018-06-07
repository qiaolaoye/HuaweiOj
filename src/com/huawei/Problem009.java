package com.huawei;


import java.util.Scanner;

/* 提取不重复的整数*/
public class Problem009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();

            boolean[] flags = new boolean[10];
            StringBuilder sb = new StringBuilder();
            while (num != 0) {
                int mod = num % 10;
                num = num / 10;
                if (!flags[mod]) {
                    sb.append(String.valueOf(mod));
                    flags[mod] = true;
                }
            }
            System.out.println(Integer.parseInt(new String(sb)));
        }
    }
}
