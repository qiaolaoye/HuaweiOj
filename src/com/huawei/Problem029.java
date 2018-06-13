package com.huawei;

import java.util.Scanner;

public class Problem029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(encrypt(s1));
            System.out.println(unEncrypt(s2));
        }
    }

    private static String encrypt(String password) {
        StringBuilder sb = new StringBuilder();
        char[] arr = password.toCharArray();
        for (char ch: arr) {
            if (ch == 'Z')
                sb.append('a');
            else if (ch == 'z')
                sb.append('A');
            else if (ch == '9')
                sb.append('0');
            else if (ch < 'Z' && ch >= 'A') {
                sb.append((char)(ch + 33));
            }
            else if (ch <'z' && ch >= 'a') {
                sb.append((char)(ch - 31));
            }
            else if (ch < '9' && ch >= '0') {
                sb.append((char)(ch + 1));
            }
            else
                sb.append(ch);
        }
        return new String(sb);
    }

    private static String unEncrypt(String password) {
        StringBuilder sb = new StringBuilder();
        char[] arr = password.toCharArray();
        for (char ch : arr) {
            if (ch == 'A')
                sb.append('z');
            else if (ch == 'a')
                sb.append('Z');
            else if (ch == '0')
                sb.append('9');
            else if (ch <= 'Z' && ch > 'A') {
                sb.append((char)(ch + 31));
            }
            else if (ch <= 'z' && ch > 'a') {
                sb.append((char)(ch - 33));
            }
            else if (ch <= '9' && ch > '0') {
                sb.append((char)(ch - 1));
            }
            else
                sb.append(ch);
        }
        return new String(sb);
    }
}
