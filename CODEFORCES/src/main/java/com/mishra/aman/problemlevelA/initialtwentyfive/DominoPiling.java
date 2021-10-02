package com.mishra.aman.problemlevelA.initialtwentyfive;
/*
https://codeforces.com/problemset/problem/50/A
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class DominoPiling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] s = br.readLine().split("\\s+");
        long n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
        System.out.println((n*m)/2);
    }
}
