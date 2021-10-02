package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class BearAndBigBrother {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] s = br.readLine().split("\\s+");
        long k = Integer.parseInt(s[0]), n = Integer.parseInt(s[1]),inc = 0;
        do{
           k = k*3;
           n = n*2;
           inc++;
        }while (k <= n);
        System.out.println(inc);
    }
}
/*
https://codeforces.com/problemset/problem/791/A
*/
