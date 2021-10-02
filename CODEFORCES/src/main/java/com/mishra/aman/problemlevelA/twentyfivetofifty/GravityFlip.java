package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class GravityFlip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int a = Integer.parseInt(br.readLine());
        String[] sA = br.readLine().split("\\s+");
        int[] ans = new int[100];
        for (int i = 0; i < a; i++) {
            int temp = Integer.parseInt(sA[i])-1;
            ans[temp]++;
        }
        for (int i = 0; i < 100; i++) {
            while(ans[i]-->0){
                System.out.print(""+(i+1)+ " ");
            }

        }
    }
}
/*

//https://codeforces.com/problemset/problem/405/A
//https://codeforces.com/contest/405/submission/127885228
public class GravityFlip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int a = Integer.parseInt(br.readLine());
        String[] sA = br.readLine().split("\\s+");
        int[] ans = new int[a];
        for (int i = 0; i < a; i++) {
            ans[i] = Integer.parseInt(sA[i]);
        }
        Arrays.sort(ans);
        for (int i = 0; i < a; i++) {
            System.out.print(""+ans[i]+ " ");
        }
    }

//https://codeforces.com/problemset/submission/405/9272152
}*/
