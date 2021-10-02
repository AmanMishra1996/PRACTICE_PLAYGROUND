package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import static java.lang.System.in;

public class WordCapitalization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String a = br.readLine();
        System.out.println(a.substring(0, 1).toUpperCase(Locale.ROOT) + a.substring(1));
    }
}
/*
https://codeforces.com/problemset/problem/281/A

*/
