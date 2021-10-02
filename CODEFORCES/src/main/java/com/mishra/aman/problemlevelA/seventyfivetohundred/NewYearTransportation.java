package com.mishra.aman.problemlevelA.seventyfivetohundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class NewYearTransportation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] aA = new int[n];
        for (int i = 1; i < n; i++) {
            aA[i] = Integer.parseInt(st.nextToken());
        }
        int temp = 1 + aA[1];
        for (int i = temp; i < n; i = temp) {
            if(i == k){
                System.out.println("YES");
                return;
            }
            temp += aA[temp];
        }
        System.out.println(temp == k ? "YES" :"NO");
    }
}

/*
https://codeforces.com/problemset/problem/500/A
*/
