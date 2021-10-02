package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class UltraFastMathematician {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s1 = br.readLine();
        int s1l = s1.length();
        String s2 = br.readLine();
        String result = "";
        for(int i = 0;i < s1l;i++){
            result += (s1.charAt(i) == s2.charAt(i)) ? "0" : "1";
        }
        System.out.println(result);
    }
}

/*
https://codeforces.com/problemset/problem/61/A
*/
