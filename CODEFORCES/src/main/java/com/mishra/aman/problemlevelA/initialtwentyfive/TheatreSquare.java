package com.mishra.aman.problemlevelA.initialtwentyfive;
/*
https://codeforces.com/problemset/problem/1/A

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class TheatreSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] s = br.readLine().split("\\s+");
        long n = Integer.parseInt(s[0]),m = Integer.parseInt(s[1]),a = Integer.parseInt(s[2]);
        //System.out.println((n+a-1)/a * ((m+a-1)/a));
        long ans =0;
        if(n%a == 0) ans += n / a;
        else ans += n / a + 1;
        if(m%a == 0) ans *= (double) m / a;
        else ans *= m / a + 1;
        System.out.println(ans);
    }
}
