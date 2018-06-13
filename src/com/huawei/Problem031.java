package com.huawei;

import java.util.Scanner;

public class Problem031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] arr = str.split("[^a-zA-Z]+"); // limit参数为0，不包括最后一个可能的空字符串
            for (int i = arr.length - 1; i > 1; i--) {
                System.out.print(arr[i] + " ");
            }
            //如果字符串数组的第一个元素是空串，那么下标为1的元素就是最后一个要输出的元素，末尾不要再加空格
            if (arr[0].length() == 0)
                System.out.println(arr[1]);
            else {
                System.out.println(arr[1] + " " + arr[0]);
            }
        }
    }
}
