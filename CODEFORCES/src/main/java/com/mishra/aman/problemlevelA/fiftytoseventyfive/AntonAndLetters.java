package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

import static java.lang.System.in;

public class AntonAndLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String a = br.readLine();
        if(a.equals("{}")){
            System.out.println("0");
            return;
        }
        String[] sA = a.replaceAll("[{}]","").split(", ");
        HashSet<String> hs = new HashSet<>(Arrays.asList(sA));
        System.out.println(hs.size());
    }
}

//https://codeforces.com/problemset/problem/443/A
//https://codeforces.com/problemset/submission/443/9135498
//https://codeforces.com/problemset/submission/443/71889288