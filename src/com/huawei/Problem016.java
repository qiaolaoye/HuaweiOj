package com.huawei;

import java.util.Scanner;

/* 购物单*/
public class Problem016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int maxPriceLimited = sc.nextInt();
            int num = sc.nextInt();
            int[] price = new int[num + 1];
            int[] weight = new int[num + 1];
            int[] flag = new int[num + 1];
            for (int i = 1; i <= num; i++) {
                price[i] = sc.nextInt();
                weight[i] = sc.nextInt();
                flag[i] = sc.nextInt();
            }

            int[][] dp = new int[num + 1][maxPriceLimited + 1];
            for (int i = 1; i <= num ; i++) {
                for (int j = price[i]; j <= maxPriceLimited; j++) {
                    // 如果是附件
                    if (flag[i] > 0) {
                        if (j >= price[i] + price[flag[i]])
                            dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - price[i]] + price[i] * weight[i]);
                    }
                    else {
                        //如果是主件
                        if (j >= price[i]) {
                            dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - price[i]] + price[i] * weight[i]);
                        }
                    }
                }
            }
            System.out.println(dp[num][maxPriceLimited]);



//            int[] dp = new int[maxPriceLimited + 1];
//            for (int i = 1; i <= num; i++) {
//                for (int j = maxPriceLimited; j >= price[i]; j--) {
//                    // 如果是附件
//                     if (flag[i] > 0) {
//                         if (j >= price[i] + price[flag[i]])
//                             dp[j] = Math.max(dp[j], dp[j - price[i]] + price[i] * weight[i]);
//                     }
//                     else {
//                         if (j >= price[i])
//                             dp[j] = Math.max(dp[j], dp[j - price[i]] + price[i] * weight[i]);
//                     }
//                }
//            }
//            System.out.println(dp[maxPriceLimited]);
        }
    }
}
