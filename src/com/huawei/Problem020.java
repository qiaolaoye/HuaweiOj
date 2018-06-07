package com.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Problem020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.length() > 8 && repeatCheck(str) && componentCheck(str))
                System.out.println("OK");
            else
                System.out.println("NG");
        }
    }

    private static boolean repeatCheck(String str) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= str.length() - 3; i++) {
            String substr = str.substring(i, i + 3);
            if (set.contains(substr))
                return false;
            else
                set.add(substr);
        }
        return true;
    }

    private static boolean componentCheck(String str) {
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean other = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch <= '9' && ch >= '0')
                digit = true;
            else if (ch <= 'Z' && ch >= 'A')
                upperCase = true;
            else if (ch <= 'z' && ch >= 'a')
                lowerCase = true;
            else
                other = true;
        }
        return (upperCase && lowerCase && digit) || (upperCase && lowerCase && other) || (upperCase && digit && other) || (lowerCase && digit && other);
    }
}
