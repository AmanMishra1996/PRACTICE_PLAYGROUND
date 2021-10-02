package com.mishra.aman.problemlevelB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class QueueAtTheSchool {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] s = br.readLine().split("\\s+");
        int n = Integer.parseInt(s[0]), t = Integer.parseInt(s[1]);
        char[] cA = br.readLine().toCharArray();
        while(t-->0){
            for (int i = 1; i < n; i++) {
                if(cA[i] == 'G' && cA[i-1] == 'B'){
                    cA[i]= 'B';
                    cA[i-1] ='G';
                    i++;
                }
            }
        }
        System.out.println(String.valueOf(cA));
    }
}
//https://codeforces.com/problemset/problem/266/B
