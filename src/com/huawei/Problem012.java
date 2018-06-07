package com.huawei;

import java.util.Scanner;

/* ×Ö·û´®·´×ª*/
public class Problem012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            System.out.println(new StringBuilder(str).reverse());
        }
    }
}
