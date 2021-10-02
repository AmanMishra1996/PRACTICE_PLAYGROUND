package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String[] ab = br.readLine().split("\\s+");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            int diff = Math.abs(a-b);
            System.out.println(
                    diff/10 + (diff%10 !=0 ? 1 : 0)
            );
            // (diff+9)/10
        }
    }
}

/* https://codeforces.com/problemset/problem/1409/A */