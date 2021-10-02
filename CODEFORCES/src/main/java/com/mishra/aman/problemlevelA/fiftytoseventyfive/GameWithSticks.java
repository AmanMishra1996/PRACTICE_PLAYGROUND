package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class GameWithSticks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] nm = br.readLine().split("\\s+");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int min = Math.min(n,m);
        System.out.println(min % 2 == 0 ? "Malvika" : "Akshat");
    }
}


/*
https://codeforces.com/problemset/problem/451/A
https://codeforces.com/problemset/submission/451/9873389
*/
