package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class SoldierAndBananas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] s = br.readLine().split("\\s+");
        long k = Integer.parseInt(s[0]),n = Integer.parseInt(s[1]),w = Integer.parseInt(s[2]);
        long ans = ((2*k+(w-1)*k)*w)/2;
        System.out.println(n > ans ? 0 : ans-n );
    }
}
/*
https://codeforces.com/problemset/problem/546/A
Arithmetic Progressions

*/
