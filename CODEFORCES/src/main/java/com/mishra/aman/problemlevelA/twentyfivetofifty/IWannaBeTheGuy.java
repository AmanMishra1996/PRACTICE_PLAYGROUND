package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

import static java.lang.System.in;

public class IWannaBeTheGuy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        String[] pA = br.readLine().split("\\s+");
        String[] qA = br.readLine().split("\\s+");
        HashSet<String> unique = new HashSet<>();
        int pAl = Integer.parseInt(pA[0]);
        int qAl = Integer.parseInt(qA[0]);
        unique.addAll(Arrays.asList(pA).subList(1, pAl + 1));
        unique.addAll(Arrays.asList(qA).subList(1, qAl + 1));
        System.out.println(unique.size()>=n ? "I become the guy." : "Oh, my keyboard!");
    }
}

/*
https://codeforces.com/problemset/problem/469/A
*/
