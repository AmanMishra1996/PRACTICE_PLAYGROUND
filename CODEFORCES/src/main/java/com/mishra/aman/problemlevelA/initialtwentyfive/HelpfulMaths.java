package com.mishra.aman.problemlevelA.initialtwentyfive;
/*
https://codeforces.com/problemset/problem/339/A
https://codeforces.com/problemset/submission/339/127325292
https://codeforces.com/problemset/submission/339/13223816
https://codeforces.com/problemset/submission/339/9265405
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class HelpfulMaths {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] s = br.readLine().split("[+]");
        int sl = s.length;
        if(sl==1) System.out.println(s[0]);
        else{
            Arrays.sort(s);
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < sl-1;i++){
                sb.append(s[i]).append("+");
            }
            System.out.println(sb.append(s[sl-1]));
        }
    }
}
