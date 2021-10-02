package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class CheapTravel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
            System.out.println(
                    m*a >= b ?
                    (n/m)*b+( b < (n%m)*a ? b : (n%m)*a)
                            :n*a
            );

    }
}

//https://codeforces.com/problemset/problem/466/A
//https://codeforces.com/problemset/submission/466/9272194