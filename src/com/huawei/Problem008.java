package com.huawei;

import java.util.*;


public class Problem008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            SortedMap<Integer, Integer> map = new TreeMap<>();
            while (num-- != 0) {
                int index = sc.nextInt();
                int value = sc.nextInt();

                if (map.containsKey(index)) {
                    int oldValue = map.get(index);
                    map.put(index, oldValue + value);
                }
                else {
                    map.put(index, value);
                }
            }

            Set<Integer> resultSet = map.keySet();
            for (Integer key : resultSet) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
