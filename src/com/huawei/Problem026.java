package com.huawei;

import java.util.*;

public class Problem026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            boolean[] flag = new boolean[arr.length];

            // 把字符给拿出来排序
            ArrayList<Character> arrayList = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (Character.isLetter(arr[i])) {
                    arrayList.add(arr[i]);
                    flag[i] = true;
                }
            }
            Collections.sort(arrayList, new Comparator<Character>() {
                @Override
                public int compare(Character t1, Character t2) {
                    String str1 = String.valueOf(t1);
                    String str2 = String.valueOf(t2);
                    return str1.compareToIgnoreCase(str2);
                }
            });

            // 把排序后的字符放回去
            Iterator<Character> it = arrayList.iterator();
            for (int i = 0; i < arr.length; i++) {
                if (flag[i] && it.hasNext()) {
                    arr[i] = it.next();
                }
            }
            System.out.println(String.valueOf(arr));
        }
    }
}
