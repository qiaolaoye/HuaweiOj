package com.huawei;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/* 删除字符串中出现次数最少的字符*/
public class Problem023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            Map<Character, Integer> map = new HashMap<>();
            char[] chars = str.toCharArray();

            for (char ch: chars) {
                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                }
                else {
                    map.put(ch, map.get(ch) + 1);
                }
            }
            // 统计字符频次的最小值
            int min = 30;
            for (char ch : map.keySet()) {
                if (map.get(ch) < min) min = map.get(ch);
            }
//            Iterator<Character> it = map.keySet().iterator();
//            while (it.hasNext()) {
//                char ch = it.next();
//                if (map.get(ch) == min)
//                    it.remove();
//            }

            //输出，不是最小出现频次的字符保留
            StringBuilder sb = new StringBuilder();
            for (char ch: chars) {
                if (map.get(ch) != min)
                    sb.append(ch);
            }
            System.out.println(sb);
        }
    }
}
