package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

import static java.lang.System.in;

public class BeautifulYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine()),size = 0;
        int result;
        while(size!=4){
            n++;
            result =n;
            HashSet<Integer> hs = new HashSet<>();
            while(result>0){
                hs.add(result%10);
                result /=10;
            }
            size =hs.size();
        }
        System.out.println(n);
    }
}

//https://codeforces.com/problemset/problem/271/A