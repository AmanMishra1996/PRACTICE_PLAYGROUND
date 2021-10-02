package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class CalculatingFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        long n = Long.parseLong(br.readLine());
        System.out.println(n%2==0 ? n/2 : n/2-n);
    }
}

/*
https://codeforces.com/problemset/problem/486/A
https://codeforces.com/problemset/submission/486/9266658
*/
