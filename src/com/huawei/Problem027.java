package com.huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            String[] arr = new String[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.next();
            }
            String str = sc.next();
            int index = sc.nextInt();

            // 记录字典中哪些是兄弟单词
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                if (check(arr[i], str)) {
                    arrayList.add(arr[i]);
                }
            }
            Collections.sort(arrayList);
            System.out.println(arrayList.size());
            if (index <= arrayList.size())
                System.out.println(arrayList.get(index - 1));
        }
    }

    // 判断s1和s2是否是兄弟单词
    private static boolean check(String s1, String s2) {
        if (s1.equals(s2)) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return String.valueOf(arr1).equals(String.valueOf(arr2));
    }
}
