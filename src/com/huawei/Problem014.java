package com.huawei;

import java.util.*;

/* ×Ö·û´®°´×ÖµäÐòÅÅÁÐ*/
public class Problem014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            List<String> list = new ArrayList<>();
            while (num-- != 0) {
                list.add(sc.next());
            }
            Collections.sort(list);
            for (String str : list) {
                System.out.println(str);
            }
        }
    }
}
