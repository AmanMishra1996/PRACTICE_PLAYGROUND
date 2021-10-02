package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class GeorgeAndAccommodation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        while(n-- > 0) {
            String[] nh = br.readLine().split("\\s+");
            int p = Integer.parseInt(nh[0]);
            int q = Integer.parseInt(nh[1]);
            ans += (q-p >=2) ? 1 :0;
        }
        System.out.println(ans);
    }
}
/*
https://codeforces.com/problemset/problem/467/A
https://codeforces.com/problemset/submission/467/30217491
*/
