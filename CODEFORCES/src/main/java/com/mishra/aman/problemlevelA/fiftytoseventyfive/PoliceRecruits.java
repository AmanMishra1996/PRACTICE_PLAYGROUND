package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class PoliceRecruits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        String[] aA = br.readLine().split("\\s+");
        int recruited = 0,ans =0,cases =0;
        for (int i = 0; i < n; i++) {
            if(aA[i].equals("-1")){
                cases++;
                if(recruited < cases) ans++;
                if(recruited >0) {
                    recruited--;
                    cases--;
                }
            }else{
                int recruitedNow = Integer.parseInt(aA[i]);
                cases = 0;
                if(recruitedNow <= 10){
                    recruited += recruitedNow;
                }
            }
        }
        System.out.println(ans);
    }
}

/*
https://codeforces.com/problemset/problem/427/A
*/
