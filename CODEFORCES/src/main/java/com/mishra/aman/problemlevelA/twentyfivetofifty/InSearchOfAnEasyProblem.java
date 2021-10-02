package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            if(s[i].equals("1")){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}

/*
https://codeforces.com/problemset/problem/1030/A
https://codeforces.com/problemset/submission/1030/44739934
*/
