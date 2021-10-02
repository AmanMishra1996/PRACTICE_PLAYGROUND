package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Translation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        /*char[] sA = br.readLine().toCharArray();
        char[] tA = br.readLine().toCharArray();
        int sl = sA.length,tl = tA.length;
        if(sl != tl){
            System.out.println("NO");
            return;
        }
        for(int i = 0;i < sl;i++){
            if(sA[i] != tA[sl-i-1]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");*/
        System.out.println(new StringBuilder(br.readLine()).reverse().toString().equals(br.readLine()) ? "YES" : "NO");
    }
}

/*
https://codeforces.com/problemset/problem/41/A
*/