package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class VasyaTheHipster {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] nm = br.readLine().split("\\s+");
        int a = Integer.parseInt(nm[0]);
        int b = Integer.parseInt(nm[1]);
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        System.out.println(min + " " +((max-min)/2));
    }
}

/* https://codeforces.com/problemset/problem/581/A */