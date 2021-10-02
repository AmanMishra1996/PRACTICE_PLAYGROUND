package com.mishra.aman.problemlevelB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.System.in;

public class Drinks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        String[] sA = br.readLine().split("\\s+");
        int sum = 0;
        for(String s : sA){
            sum += Integer.parseInt(s);
        }
        System.out.println(BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(n),12 ,RoundingMode.HALF_EVEN));
    }
}

/*
https://codeforces.com/problemset/problem/200/B
*/
