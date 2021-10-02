package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class LuckyDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        int[] alA = {4,7,44,47,74,77,444,447,474,744,777,774,747,477};
        for(int i : alA){
            if(i==n || n%i==0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
/*
 https://codeforces.com/problemset/problem/122/A
 https://codeforces.com/problemset/submission/122/9132980
*/