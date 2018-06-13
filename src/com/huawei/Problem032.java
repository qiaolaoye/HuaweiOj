package com.huawei;

import java.util.Scanner;

public class Problem032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            System.out.println(lps(str));
        }
    }

    private static int lps(String s) {
        int length = s.length();
        int start = 0;
        int end = 0;
        boolean[][] flag = new boolean[length][length];
        //初始化
        for (int i = 0; i < length; i++) {
            flag[i][i] = true;
            if (i < length - 1 && s.charAt(i) == s.charAt(i + 1)) {
                flag[i][i + 1] = true;
                start = i;
                end = i + 1;
            }
        }

        for (int len = 3; len <= length; len++) {
            for (int i = 0; i <= length - len; i++) { // 开始下标
                int j = i + len - 1;  // 结束下标
                if (flag[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    flag[i][j] = true;
                    start = i;
                    end = j;
                }
            }
        }
        return end - start + 1;
    }
}
