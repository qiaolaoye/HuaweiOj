package com.huawei;

import java.util.Scanner;

public class Problem013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            for (int i = strs.length - 1; i > 0; i--) {
                System.out.print(strs[i] + " ");
            }
            System.out.println(strs[0]);
        }
    }
}
