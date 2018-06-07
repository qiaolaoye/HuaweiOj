package com.huawei;

import java.util.*;

/* 明明的随机数 */
public class Problem003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            SortedSet<Integer> set = new TreeSet<>();

            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                if (!set.contains(value)) {
                    set.add(value);
                }
            }

            for (Integer aSet : set) {
                System.out.println(aSet);
            }
        }
    }
}
