package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class ILoveUsername {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader( in));
        int n = Integer.parseInt(br.readLine());
        String[] nA = br.readLine().split("\\s+");
        int[] niA = new int[n];
        for (int i = 0; i < n; i++) {
            niA[i] = Integer.parseInt(nA[i]);
        }
        int max = niA[0],min = niA[0],count = 0;
        for (int i = 1; i < n; i++) {
            if(niA[i] > max) {
                count++;
                max = niA[i];
            }
            if(niA[i] < min) {
                count++;
                min = niA[i];
            }
        }
        System.out.println(count);
    }
}

//https://codeforces.com/problemset/problem/155/A