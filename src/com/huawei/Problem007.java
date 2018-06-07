package com.huawei;

import java.util.Scanner;

public class Problem007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()) {
            double num = sc.nextDouble();
            int int_part = (int) num;
            double float_part = num - int_part;
            if (float_part >= 0.5)
                System.out.println(int_part + 1);
            else
                System.out.println(int_part);
        }
    }
}
