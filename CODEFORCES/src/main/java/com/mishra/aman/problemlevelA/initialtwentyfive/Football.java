package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Football {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String a = br.readLine();
        System.out.println(solution(a));
    }

    private static String solution(String a) {
        char[] c =  a.toCharArray();
        int al = a.length(),count = 0;
        for (int i = 1; i < al; i++) {
            if(c[i] == c[i-1]){
                count++;
                if(count == 6) return "YES";
            }else{
                count = 0;
            }
        }
        return "NO";
    }
}
//https://codeforces.com/problemset/problem/96/A
//https://codeforces.com/problemset/submission/96/10152862