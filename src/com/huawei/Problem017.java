package com.huawei;


import java.util.Scanner;

public class Problem017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int x = 0, y = 0;
            String str = sc.nextLine();
            String[] strs = str.split(";");

            for (String curStr : strs) {
                if (curStr.length() == 0 || curStr.length() > 3) continue;
                char ch = curStr.charAt(0);
                if (!checkNumber(curStr.substring(1, curStr.length()))) continue;
                int value = Integer.parseInt(curStr.substring(1, curStr.length()));

                if (ch == 'A') {
                    x -= value;
                } else if (ch == 'S') {
                    y -= value;
                } else if (ch == 'W') {
                    y += value;
                } else if (ch == 'D') {
                    x += value;
                } else
                    continue;
            }
            System.out.println(x + "," + y);
        }
    }


    private static boolean checkNumber(String str) {
        if (str.length() == 0) return false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch >= '0' && ch <= '9')) return false;
        }
        return true;
    }
}
