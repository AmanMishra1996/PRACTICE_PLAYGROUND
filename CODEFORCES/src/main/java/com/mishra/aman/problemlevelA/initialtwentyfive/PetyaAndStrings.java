package com.mishra.aman.problemlevelA.initialtwentyfive;
/*
https://codeforces.com/problemset/problem/112/A
https://codeforces.com/problemset/submission/112/127322661
https://codeforces.com/problemset/submission/112/9265069
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class PetyaAndStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String a = br.readLine();
        String b = br.readLine();
        int ans = a.compareToIgnoreCase(b);
        if(ans > 0) System.out.println("1");
        else if(ans < 0) System.out.println("-1");
        else System.out.println("0");
    }
}
