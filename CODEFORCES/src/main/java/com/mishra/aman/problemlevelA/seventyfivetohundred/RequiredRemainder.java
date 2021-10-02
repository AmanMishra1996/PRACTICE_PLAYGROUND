package com.mishra.aman.problemlevelA.seventyfivetohundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class RequiredRemainder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int temp = (n/x);
            System.out.println((n%x >=y) ? (temp*x)+y : (temp-1)*x+y);
        }
    }
}

//https://codeforces.com/problemset/problem/1374/A
