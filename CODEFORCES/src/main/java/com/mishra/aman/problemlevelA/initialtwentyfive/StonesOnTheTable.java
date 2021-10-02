package com.mishra.aman.problemlevelA.initialtwentyfive;
/*
https://codeforces.com/problemset/problem/266/A
https://codeforces.com/problemset/submission/266/9264985
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class StonesOnTheTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int l = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.println(solution(s,l));
    }
    private static int solution(String s, int l) {
        if(l == 1) return 0;
        int ans = 0;
        for (int i = 1; i < l; i++) {
            if(s.charAt(i)==s.charAt(i-1)) ans++;
        }
        return ans;
    }
}
