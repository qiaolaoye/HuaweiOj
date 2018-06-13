package com.huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//https://blog.csdn.net/cillyb/article/details/55511666
public class Problem028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            ArrayList<Integer> A = new ArrayList<>(); // 存放奇数
            ArrayList<Integer> B = new ArrayList<>(); // 存放偶数
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0) {
                    B.add(x);
                } else
                    A.add(x);
            }

            boolean[] visited = new boolean[B.size()];
            int[] match = new int[B.size()];
            int sum = 0;
            for (Integer anA : A) {
                Arrays.fill(visited, false);
                if (find(anA, B, visited, match))
                    sum++;
            }
            System.out.println(sum);
        }
    }

    private static boolean find(Integer x, ArrayList<Integer> B, boolean[] visited, int[] match) {
        for (int j = 0; j < B.size(); j++) {
            if (isPrime(x + B.get(j)) && !visited[j]) {
                visited[j] = true;
                if (match[j] == 0 || find(match[j], B, visited, match)) {
                    match[j] = x;
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isPrime(Integer x) {
        for (int i = 2; i <= Math.pow(x, 0.5); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
