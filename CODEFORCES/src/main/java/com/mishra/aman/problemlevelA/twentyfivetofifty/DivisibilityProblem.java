package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class DivisibilityProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int t = Integer.parseInt(br.readLine());
        while (t-- >0){
            String[] nm = br.readLine().split("\\s+");
            int n =  Integer.parseInt(nm[0]);
            int m =  Integer.parseInt(nm[1]);
            System.out.println(n%m == 0 ? 0 : m - (n%m));
        }
    }
}

//https://codeforces.com/problemset/problem/1328/A
//https://codeforces.com/problemset/submission/1328/74399093
//https://codeforces.com/problemset/submission/1328/75297958