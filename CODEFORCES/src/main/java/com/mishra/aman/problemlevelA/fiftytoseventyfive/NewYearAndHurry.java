package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class NewYearAndHurry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] nm = br.readLine().split("\\s+");
        int n = Integer.parseInt(nm[0]);
        int k = Integer.parseInt(nm[1]);
        int tR = (240-k);
        int count = 0;
        while(tR>=0){
            count++;
            tR -= 5*count;
        }
        System.out.println(tR == 0 ? Math.min(n,count) :  Math.min(n, --count) );

    }
}

//https://codeforces.com/problemset/problem/750/A
