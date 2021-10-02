package com.mishra.aman.problemlevelA.initialtwentyfive;
/*
https://codeforces.com/problemset/problem/282/A
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class BitPlusPlus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        while (n-- > 0){
            String temp  = br.readLine();
            if (temp.equals("++X") || temp.equals("X++")) {
                ++x;
            } else {
                --x;
            }
        }
        System.out.println(x);
    }
}
