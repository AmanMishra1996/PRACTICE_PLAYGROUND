package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class Boredom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] dp = new long[100001];
        long[] count = new long[100001];
        while (st.hasMoreTokens()){
            count[Integer.parseInt(st.nextToken())]++;
        }
        dp[0] = 0;
        dp[1] = count[1];
        for (int i = 2; i <=100000 ; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+i*count[i]);
        }
        System.out.println(dp[100000]);
    }
}
