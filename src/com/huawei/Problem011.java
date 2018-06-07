package com.huawei;

import java.util.Scanner;

/* Êý×Öµßµ¹*/
public class Problem011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            String str = String.valueOf(num);
            System.out.println(new StringBuilder(str).reverse());
        }
    }
}
