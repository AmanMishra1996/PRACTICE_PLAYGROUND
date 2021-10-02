package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import static java.lang.System.in;

public class cAPSlOCK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s = br.readLine();
        int sl = s.length();
        if(sl == 1){
            System.out.println(Character.isLowerCase(s.charAt(0)) ?
                     s.toUpperCase(Locale.ROOT)
                    : s.toLowerCase(Locale.ROOT)
            );
            return;
        }
        for(int i = 1;i < sl;i++){
            if(Character.isLowerCase(s.charAt(i))) {
                System.out.println(s);
                return;
            }
        }
        System.out.println(
                Character.isLowerCase(s.charAt(0)) ?
                        s.substring(0,1).toUpperCase(Locale.ROOT)+s.substring(1).toLowerCase(Locale.ROOT)
                        : s.toLowerCase(Locale.ROOT)
                );
    }
}

//https://codeforces.com/problemset/problem/131/A
//https://codeforces.com/problemset/submission/131/9264939