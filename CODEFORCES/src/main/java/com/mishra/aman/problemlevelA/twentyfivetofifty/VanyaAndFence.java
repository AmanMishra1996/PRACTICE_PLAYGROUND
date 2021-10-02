package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class VanyaAndFence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] nh = br.readLine().split("\\s+");
        int n = Integer.parseInt(nh[0]);
        int h = Integer.parseInt(nh[1]);
        String[] hE = br.readLine().split("\\s+");
        int count = 0;
        for(int i = 0;i <n;i++){
            if(Integer.parseInt(hE[i]) > h) count++;
        }
        System.out.println(n+count);
    }
}

/* https://codeforces.com/problemset/problem/677/A */