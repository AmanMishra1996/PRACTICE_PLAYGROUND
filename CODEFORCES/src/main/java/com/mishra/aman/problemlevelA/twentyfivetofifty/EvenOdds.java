package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class EvenOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] s = br.readLine().split("\\s+");
        long n = Long.parseLong(s[0]);
        long k = Long.parseLong(s[1]);
        if(k <= (n+1)/2){
            System.out.println(1+(k-1)*2);
        }else{
            System.out.println((k-(n+1)/2)*2);
        }
    }
}

/*
https://codeforces.com/problemset/problem/318/A
https://codeforces.com/problemset/submission/318/31200492
*/
