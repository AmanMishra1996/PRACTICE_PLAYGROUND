package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Elephant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        long n = Integer.parseInt(br.readLine());
       // System.out.println(n/5+(n%5)/4+(n%5%4)/3+(n%5%4%3)/2+(n%5%4%3%2)/1);
        System.out.println(n/5+(n%5 ==0 ? 0 : 1));
    }
}
/*
https://codeforces.com/problemset/problem/617/A
https://codeforces.com/contest/617/submission/15550796
 (n + 4) / 5  in case want to check remainder existence already
https://codeforces.com/problemset/submission/617/15516838
*/
