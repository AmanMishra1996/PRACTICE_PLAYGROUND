package com.mishra.aman.problemlevelB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class GiftsFixing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int minA = Integer.MAX_VALUE,minB = Integer.MAX_VALUE;
            long result = 0;
            int[] aA = new int[n];
            int[] bA = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                aA[i] = Integer.parseInt(st.nextToken());
                minA = Math.min(minA,aA[i]);
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                bA[i] = Integer.parseInt(st.nextToken());
                minB = Math.min(minB,bA[i]);
            }
            for (int i = 0; i < n; i++) {
                    result += Math.max(aA[i] - minA , bA[i] - minB);
            }
            System.out.println(result);
        }
    }
}

/*
https://codeforces.com/problemset/problem/1399/B
*/
