package com.mishra.aman.problemlevelA.initialtwentyfive;
/*
https://codeforces.com/problemset/problem/118/A
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import static java.lang.System.in;

public class StringTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String a = br.readLine().toLowerCase(Locale.ROOT);
        int sl = a.length();
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i < sl;i++){
            if(!(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i'
            || a.charAt(i)=='o' || a.charAt(i)=='u' || a.charAt(i)=='y')){
                ans.append(".").append(a.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
