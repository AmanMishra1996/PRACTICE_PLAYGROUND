package com.mishra.aman.problemlevelA.seventyfivetohundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class ChoosingTeams {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        if(k > 5){
            System.out.println("0");
        }else{
            int temp = 5-k;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                if(Integer.parseInt(st.nextToken()) <= temp) count++;
            }
            System.out.println(count/3);
        }
    }
}

//https://codeforces.com/problemset/problem/432/A
