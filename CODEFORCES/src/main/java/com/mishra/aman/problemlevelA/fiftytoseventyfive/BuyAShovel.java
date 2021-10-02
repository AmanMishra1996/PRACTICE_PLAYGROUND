package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class BuyAShovel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] nm = br.readLine().split("\\s+");
        int k = Integer.parseInt(nm[0]);
        int l = Integer.parseInt(nm[1]);
        int ans = 1,temp = k;
        do{
            k = temp * ans;
            ans++;
        }while(!(k%10 == 0 || k%10 == l));
        System.out.println(ans-1);
    }
}

//https://codeforces.com/problemset/problem/732/A
//https://codeforces.com/problemset/submission/732/31230583
