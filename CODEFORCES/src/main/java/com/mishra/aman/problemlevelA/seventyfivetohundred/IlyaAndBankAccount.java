package com.mishra.aman.problemlevelA.seventyfivetohundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class IlyaAndBankAccount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s = br.readLine();
        if(s.charAt(0) != '-'){
            System.out.println(s);
        }else{
            int sl = s.length();
            if(s.charAt(sl-1) > s.charAt(sl-2)){
                System.out.println(s.substring(0,sl-1));
            }else{
                System.out.println(Integer.parseInt(s.substring(0,sl-2)+s.substring(sl-1)));
            }
        }
    }
}

/*
https://codeforces.com/problemset/problem/313/A
*/
