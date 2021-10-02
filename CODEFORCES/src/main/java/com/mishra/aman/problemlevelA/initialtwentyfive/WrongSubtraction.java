package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class WrongSubtraction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] s = br.readLine().split("\\s+");
        long n = Integer.parseInt(s[0]), k = Integer.parseInt(s[1]);
        while(k-- >0){
            if(n%10 >0) n--;
            else n /=10;
        }
        System.out.println(n);
    }
}
/* https://codeforces.com/problemset/problem/977/A */
