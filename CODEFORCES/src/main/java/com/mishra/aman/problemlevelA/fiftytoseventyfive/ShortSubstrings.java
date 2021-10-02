package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class ShortSubstrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int t = Integer.parseInt(br.readLine());
        while (t-- >0){
            String s = br.readLine();
            int sl = s.length();
            StringBuilder sb = new StringBuilder(s.substring(0,2));
            for (int i = 3; i < sl; i+=2) {
                sb.append(s.charAt(i));
            }
            System.out.println(sb);
        }
    }
}
/* https://codeforces.com/problemset/problem/1367/A */