package com.huawei;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/* 简单错误记录
* 题意： 输出最后统计的8个记录
* */
public class Problem019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String str = sc.next();
            int lineNum = sc.nextInt();
            String[] arr = str.split("\\\\");
            String s = arr[arr.length - 1];
            if (s.length() > 16) {
                s = s.substring(s.length() - 16);
            }

            String key = s + " " + lineNum;
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int count = 0;
        for (String str : map.keySet()) {
            count++;
            if (count > (map.keySet().size() - 8)) {
                System.out.println(str + " " + map.get(str));
            }
        }
    }
}
