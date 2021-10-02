package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Dubstep {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s = br.readLine();
        System.out.println(s.replaceAll("(WUB)+"," ").trim());
    }
}

//https://codeforces.com/problemset/problem/208/A
//https://codeforces.com/problemset/submission/208/9266470
