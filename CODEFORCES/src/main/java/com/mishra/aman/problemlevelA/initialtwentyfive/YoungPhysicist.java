package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class YoungPhysicist {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        int xsum = 0,ysum = 0, zsum =0;
        while (n-- > 0) {
            String[] s = br.readLine().split("\\s+");
            xsum += Integer.parseInt(s[0]);
            ysum += Integer.parseInt(s[1]);
            zsum += Integer.parseInt(s[2]);
        }
        System.out.println(xsum==0 && ysum == 0 && zsum ==0 ? "YES" : "NO");
    }
}
/*
https://codeforces.com/problemset/problem/69/A
*/
