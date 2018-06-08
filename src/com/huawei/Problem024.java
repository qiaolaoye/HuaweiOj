package com.huawei;

import java.util.Scanner;

public class Problem024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }

            int[] dp1 = new int[num];
            int[] dp2 = new int[num];
            // 从左向右
            for (int i = 0; i < num; i++) {
                dp1[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (arr[j] < arr[i] && dp1[i] < dp1[j] + 1)
                        dp1[i] = dp1[j] + 1;
                }
            }
            //从右向左
            for (int i = num - 1; i >= 0; i--) {
                dp2[i] = 1;
                for (int j = num - 1; j > i ; j--) {
                    if (arr[j] < arr[i] && dp2[i] < dp2[j] + 1)
                        dp2[i] = dp2[j] + 1;
                }
            }

            int max = 0;
            for (int i = 0; i < num; i++) {
                if (max < dp1[i] + dp2[i])
                    max = dp1[i] + dp2[i];
            }
            System.out.println(num - max + 1);
        }
    }
}
