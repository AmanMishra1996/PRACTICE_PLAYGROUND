package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import static java.lang.System.in;

public class Word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String  s = br.readLine();
        char[] cA = s.toCharArray();
        int lower = 0, upper = 0;
        for(char c :cA){
            if(c>=65 && c <=90) upper++;
            else lower++;
        }
        if(upper > lower) System.out.println(s.toUpperCase(Locale.ROOT));
        else System.out.println(s.toLowerCase(Locale.ROOT));
    }
}
/*
https://codeforces.com/problemset/problem/59/A

*/
