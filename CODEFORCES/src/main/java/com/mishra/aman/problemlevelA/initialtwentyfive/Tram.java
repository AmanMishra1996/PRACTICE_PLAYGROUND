package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Tram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine()),ans = 0,max = Integer.MIN_VALUE;
        while(n-- >0){
           String[] s = br.readLine().split("\\s+");
           ans += (-Integer.parseInt(s[0])+Integer.parseInt(s[1]));
           max = Math.max(ans,max);
        }
        System.out.println(max);
    }
}
/*
https://codeforces.com/problemset/problem/116/A
*/
