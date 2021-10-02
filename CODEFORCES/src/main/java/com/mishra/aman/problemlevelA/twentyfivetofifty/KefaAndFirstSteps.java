package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class KefaAndFirstSteps {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        String[] sA = br.readLine().split("\\s+");
        int max = Integer.MIN_VALUE,count =0;
        for(int i = 0; i < n ;i++){
            if(i == 0 || Integer.parseInt(sA[i]) >= Integer.parseInt(sA[i-1])){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(max,count);

        }
        System.out.println(max);
    }
}

/*
https://codeforces.com/problemset/problem/580/A
*/
