package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class AntonAndDanik {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        char[] sA= br.readLine().toCharArray();
        int counterA = 0;
        for(int i = 0;i < n;i++){
            if(sA[i] == 'A') counterA++;
        }
        if(counterA > n-counterA){
            System.out.println("Anton");
        }else{
            System.out.println( counterA == n-counterA ? "Friendship" : "Danik" );
        }
    }
}

/* https://codeforces.com/problemset/problem/734/A */