package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class RemoveSmallest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String[] aA = br.readLine().split("\\s+");
            boolean ans = true;
            if(n == 1){
                System.out.println("YES");
            }else {
                int[] aiA = new int[n];
                for (int i = 0; i < n; i++) {
                    aiA[i] = Integer.parseInt(aA[i]);
                }
                Arrays.sort(aiA);
                for (int i = 1; i < n; i++) {
                    if (aiA[i] - aiA[i - 1] > 1) {
                        ans = false;
                        break;
                    }
                }
                System.out.println(ans ? "YES" : "NO");
            }
        }
    }
}

/*
 https://codeforces.com/problemset/problem/1399/A
 */