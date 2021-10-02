package com.mishra.aman.problemlevelB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

import static java.lang.System.in;

public class VanyaAndLanterns {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] nl = br.readLine().split("\\s+");
        int n = Integer.parseInt(nl[0]);
        int l = Integer.parseInt(nl[1]);
        String[] aA = br.readLine().split("\\s+");
        int[] aiA = new int[n];
        for (int i = 0; i < n; i++) {
            aiA[i] = Integer.parseInt(aA[i]);
        }
        Arrays.sort(aiA);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            max = Math.max(max,aiA[i]-aiA[i-1]);
        }
        BigDecimal ans = BigDecimal.valueOf(max).divide(BigDecimal.valueOf(2), 10,RoundingMode.HALF_EVEN);
        int temp = Math.max(aiA[0],l-aiA[n-1]);
        System.out.println(ans.compareTo(BigDecimal.valueOf(temp)) >= 0 ? ans : temp+".0000000000" );

    }
}

/* https://codeforces.com/problemset/problem/492/B */

