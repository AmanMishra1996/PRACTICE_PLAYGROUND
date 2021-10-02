package com.mishra.aman.problemlevelB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class XeniaAndRingroad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] nm = br.readLine().split("\\s+");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String[] aA = br.readLine().split("\\s+");
        int[] aiA = new int[m];
        long ans = 0;
        for (int i = 0; i < m; i++) {
            aiA[i] = Integer.parseInt(aA[i]);
        }
        for (int i = 0; i < m; i++) {
            if (i == 0){
                ans += aiA[i]-1;
            }else if(aiA[i] < aiA[i-1]){
                ans += (n-aiA[i-1]) + aiA[i];
            }else if(aiA[i] > aiA[i-1]){
                ans += aiA[i] - aiA[i-1];
            }
        }
        System.out.println(ans);

    }
}

/*
https://codeforces.com/problemset/problem/339/B
*/
