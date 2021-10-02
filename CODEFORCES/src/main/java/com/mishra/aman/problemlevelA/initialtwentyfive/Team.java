package com.mishra.aman.problemlevelA.initialtwentyfive;
/*
https://codeforces.com/problemset/problem/231/A

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;
import static java.lang.System.out;

public class Team {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        while (n-- > 0){
            String[] s = br.readLine().split("\\s+");
            if(Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + Integer.parseInt(s[2]) >=2) ans++;
        }
        out.println(ans);
    }
}
