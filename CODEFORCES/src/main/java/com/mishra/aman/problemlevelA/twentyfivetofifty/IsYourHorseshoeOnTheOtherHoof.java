package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;

import static java.lang.System.in;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] sA = br.readLine().split("\\s+");
        HashSet<String> unique = new HashSet<>();
        Collections.addAll(unique, sA);
        System.out.println(4-unique.size());
    }
}

/*
https://codeforces.com/problemset/problem/228/A
*/
