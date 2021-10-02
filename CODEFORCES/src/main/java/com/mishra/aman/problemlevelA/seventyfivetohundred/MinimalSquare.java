package com.mishra.aman.problemlevelA.seventyfivetohundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class MinimalSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()),b = Integer.parseInt(st.nextToken());
            int min = Math.min(a,b),max = Math.max(a,b);
            System.out.println(max <= 2*min ? (2*min)*(2*min) : max*max);
        }
    }
}


//https://codeforces.com/problemset/problem/1360/A
