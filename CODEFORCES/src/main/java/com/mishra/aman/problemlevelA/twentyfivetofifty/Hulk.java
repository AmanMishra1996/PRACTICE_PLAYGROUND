package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Hulk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i <= n;i++){
            if(i==n && i%2 != 0){
                sb.append("I hate it");
            }else if(i == n){
                sb.append("I love it");
            }else if(i%2 !=0){
                sb.append("I hate that ");
            }else{
                sb.append("I love that ");
            }
        }
        System.out.println(sb);
    }
}

//https://codeforces.com/problemset/problem/705/A
//https://codeforces.com/problemset/submission/705/19719454