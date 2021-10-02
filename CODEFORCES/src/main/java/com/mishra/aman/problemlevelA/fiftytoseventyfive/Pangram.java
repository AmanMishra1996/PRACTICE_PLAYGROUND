package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

import static java.lang.System.in;

public class Pangram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int t = Integer.parseInt(br.readLine());
        char[] cA = br.readLine().toUpperCase().toCharArray();
        if(t<26){
            System.out.println("NO");
            return;
        }
        HashSet<Character> hs = new HashSet<>();
        for(char ch : cA){
            hs.add(ch);
        }
        System.out.println(hs.size()==26 ? "YES" : "NO");
    }
}

/*
https://codeforces.com/problemset/problem/520/A
*/
