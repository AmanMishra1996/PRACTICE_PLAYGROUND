package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.in;

public class Twins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        String[] sA= br.readLine().split("\\s+");
        Integer[] a = new Integer[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sA[i]);
            sum += temp;
            a[i] = temp;
        }
        int coin = 0;
        int tempsum = 0;
        Arrays.sort(a , Collections.reverseOrder());
        for (int i : a){
            tempsum +=i;
            coin++;
            if(tempsum > sum -tempsum){
                System.out.println(coin);
                return;
            }
        }

    }
}
/*
https://codeforces.com/problemset/problem/160/A
 */
