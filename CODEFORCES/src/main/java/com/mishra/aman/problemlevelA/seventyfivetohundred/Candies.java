package com.mishra.aman.problemlevelA.seventyfivetohundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Candies {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- > 0){
            int n = Integer.parseInt(br.readLine());
            for (int i = 2; i <= 29; i++) {
                if(n%(Math.pow(2,i)-1) == 0){
                    System.out.println((int)(n/(Math.pow(2,i)-1)));
                    break;
                }
            }
        }
    }
}

//https://codeforces.com/problemset/problem/1343/A
