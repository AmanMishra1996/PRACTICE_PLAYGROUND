package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Presents {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        String[] fA = br.readLine().split("\\s+");
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(fA[i])-1;
            ans[temp] = ""+(i+1);
        }
        for(String a : ans){
            System.out.print(a+" ");
        }
    }
}

/*
https://codeforces.com/problemset/problem/136/A
*/
