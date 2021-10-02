package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class RestoringThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer sr = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(sr.nextToken());
        int x2 = Integer.parseInt(sr.nextToken());
        int x3 = Integer.parseInt(sr.nextToken());
        int x4 = Integer.parseInt(sr.nextToken());
        int[] arr = {x1,x2,x3,x4};
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < 4; i++) {
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < 4; i++) {
            if(i != maxIndex){
                System.out.print(max-arr[i] +" ");
            }
        }
    }
}

/* https://codeforces.com/problemset/problem/1154/A */