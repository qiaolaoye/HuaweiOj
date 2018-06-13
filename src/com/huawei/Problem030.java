package com.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class Problem030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            String str = s1 + s2;
            char[] arr = str.toCharArray();
            char[] arr1 = new char[(arr.length + 1) / 2];
            char[] arr2 = new char[(arr.length + 1) / 2];
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    arr1[i / 2] = arr[i];
                }
                else {
                    arr2[i / 2] = arr[i];
                }
            }
            if (arr.length % 2 == 0) {
                Arrays.sort(arr2);
            }
            else {
                Arrays.sort(arr2, 0, arr2.length - 1);
            }
            Arrays.sort(arr1);
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    arr[i] = arr1[i / 2];
                }
                else {
                    arr[i] = arr2[i / 2];
                }
            }

            StringBuilder sb = new StringBuilder();
            for (char aChar : arr) {
                sb.append(convert(aChar));
            }
            System.out.println(sb);
        }
    }

    private static String convert(char ch) {
        String helper1 = "0123456789ABCDEFabcdef";
        String helper2 = "084C2A6E195D3B7F5D3B7F";
        if ((ch <= '9' && ch >= '0') || (ch <= 'F' && ch >= 'A') || (ch <= 'f' && ch >= 'a')) {
            int index = helper1.indexOf(ch);
            return String.valueOf(helper2.charAt(index));
        }
        return String.valueOf(ch);
    }
}
