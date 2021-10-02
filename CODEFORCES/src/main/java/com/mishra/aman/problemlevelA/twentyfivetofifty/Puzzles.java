package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class Puzzles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] nm = br.readLine().split("\\s+");
        int n =  Integer.parseInt(nm[0]);
        int m =  Integer.parseInt(nm[1]);
        String[] pA = br.readLine().split("\\s+");
        int[] temp = new int[m];
        for (int i = 0; i < m;i++) {
            temp[i] = Integer.parseInt(pA[i]);
        }
        Arrays.sort(temp);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= m-n; i++) {
            ans = Math.min(ans,temp[i+n-1]-temp[i]);
        }
        System.out.println(ans);
    }
}

/* https://codeforces.com/problemset/problem/337/A */
