package com.huawei;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Problem021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] chars = sc.next().toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char ch : chars) {
                if (ch <= 'Z' && ch >= 'A') {
                    sb.append(convertUpper(ch));
                } else if (ch <= 'z' && ch >= 'a') {
                    sb.append(convertLower(ch));
                } else {
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }
    }

    private static char convertUpper(char ch) {
        if (ch == 'Z') return 'a';
        else {
            return (char) (ch + 33);
        }
    }

    private static String convertLower(char ch) {
        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 2);
        map.put("def", 3);
        map.put("ghi", 4);
        map.put("jkl", 5);
        map.put("mno", 6);
        map.put("pqrs", 7);
        map.put("tuv", 8);
        map.put("wxyz", 9);
        for (String str : map.keySet()) {
            if (str.contains(String.valueOf(ch)))
                return String.valueOf(map.get(str));
        }
        return null;
    }
}
