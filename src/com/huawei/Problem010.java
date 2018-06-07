package com.huawei;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* 字符个数统计*/
public class Problem010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            Set<Character> set = new HashSet<>();
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }
            System.out.println(set.size());
        }
    }
}
