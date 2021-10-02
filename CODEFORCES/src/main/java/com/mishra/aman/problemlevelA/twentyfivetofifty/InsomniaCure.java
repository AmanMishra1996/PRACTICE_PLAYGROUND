package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class InsomniaCure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int k = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int ans = 0;
        if(k==1 || l == 1 || m == 1 || n == 1){
            System.out.println(d);
        }else{
           /* System.out.println(
                    d/k+d/l+d/m+d/n - d/(lcm(k,l)) -d/(lcm(k,m)) -d/(lcm(k,n)) -d/(lcm(l,m)) -d/(lcm(l,n)) -
                            d/(lcm(m,n))
            );*/
            for(int i =1;i<=d;i++){
                if(i%k==0 || i%l==0 || i%m==0 || i%n==0) ans++;
            }
            System.out.println(ans);
        }
    }
    /*public static int lcm(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        int absHigherNumber = Math.max(number1, number2);
        int absLowerNumber = Math.min(number1, number2);
        int lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber;
        }
        return lcm;
    }*/
}

/*
https://codeforces.com/problemset/problem/148/A

https://codeforces.com/contest/148/submission/11987935        O(n)
*/
