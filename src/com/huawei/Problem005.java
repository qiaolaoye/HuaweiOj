package com.huawei;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* ½øÖÆ×ª»»*/
public class Problem005 {
    private static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String next = sc.next();
            String str = next.substring(2, next.length());

            int n = str.length();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int value = map.get(str.charAt(n - 1 - i));
                sum += Math.pow(16, i) * value;
            }
            System.out.println(sum);
        }

    }
}
