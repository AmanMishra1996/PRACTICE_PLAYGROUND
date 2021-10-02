package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Magnets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        char last = br.readLine().charAt(1);
        int gC = 1;
        while(n -- > 1){
            String temp = br.readLine();
            gC += (last == temp.charAt(0) ? 1 : 0);
            last = temp.charAt(1);
        }
        System.out.println(gC);
    }
}

/*
https://codeforces.com/problemset/problem/344/A
*/