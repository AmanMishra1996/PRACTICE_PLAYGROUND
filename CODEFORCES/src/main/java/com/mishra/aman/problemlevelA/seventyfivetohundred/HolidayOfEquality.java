package com.mishra.aman.problemlevelA.seventyfivetohundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class HolidayOfEquality {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] aA = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int temp =Integer.parseInt(st.nextToken());
            aA[i] = temp;
            max = Math.max(max,temp);
        }
        int ans =0;
        for (int i = 0; i < n; i++) {
            ans += (max-aA[i]);
        }
        System.out.println(ans);
    }
}

/*
https://codeforces.com/problemset/problem/758/A
*/
