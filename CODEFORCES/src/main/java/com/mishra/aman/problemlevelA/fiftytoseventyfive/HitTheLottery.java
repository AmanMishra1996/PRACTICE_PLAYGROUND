package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class HitTheLottery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        long t = Long.parseLong(br.readLine());
        long ans = t/100;
        long temp = t%100;
        ans += temp/20;
        temp = temp%20;
        ans += temp/10;
        temp = temp%10;
        ans +=temp/5;
        temp = temp%5;
        ans += temp;
        System.out.println(ans);
    }
}

//https://codeforces.com/problemset/problem/996/A
//https://codeforces.com/problemset/submission/996/45123812