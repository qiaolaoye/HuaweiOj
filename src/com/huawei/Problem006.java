package com.huawei;


import java.util.Scanner;

public class Problem006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            while (num != 1) { // ѭ����ֹ
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
