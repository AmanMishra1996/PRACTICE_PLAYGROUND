package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class HQ9PLUS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        char[] cA = br.readLine().toCharArray();
        for(char c : cA){
            if(c == 'H' || c=='Q' || c == '9'){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}

//https://codeforces.com/problemset/problem/133/A
//https://codeforces.com/problemset/submission/133/13223106