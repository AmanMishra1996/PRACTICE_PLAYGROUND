package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Expression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int ans = a+b+c;
        ans = Math.max(ans,(a + b) * c);
        ans = Math.max(ans,a * (b + c));
        ans = Math.max(ans, a * b * c);
        System.out.println(ans);
        }

}

//https://codeforces.com/problemset/problem/479/A
//https://codeforces.com/problemset/submission/479/9272211
