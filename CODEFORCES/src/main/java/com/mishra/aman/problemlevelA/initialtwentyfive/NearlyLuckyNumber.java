package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class NearlyLuckyNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        char[] cA = br.readLine().toCharArray();
        int counter = 0;
        for(char c : cA){
            if(c == '4' || c == '7') counter++;
        }
        System.out.println(counter == 4 || counter == 7 ? "YES" : "NO");
    }
}

/*
 https://codeforces.com/problemset/problem/110/A
 */