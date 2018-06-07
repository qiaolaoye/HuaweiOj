package com.huawei;


import java.util.Scanner;

/* 质数因子 */
public class Problem006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            while (num != 1) { // 循环终止
                for (int i = 2; i <= num ; i++) {
                    if (num % i == 0) {
                        num /= i;
                        System.out.print(i);
                        System.out.print(" ");
                        break;
                    }
                }
            }

        }
    }
}
