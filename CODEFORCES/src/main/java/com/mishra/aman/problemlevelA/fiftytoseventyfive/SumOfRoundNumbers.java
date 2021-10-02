package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class SumOfRoundNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String s = br.readLine();
            int l = s.length();
            if (l == 1) {
                System.out.println("1");
                System.out.println(s);
            }else{
                int count = 0;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < l; i++) {
                    if(s.charAt(i) != '0'){
                        count++;
                        sb.append(s.charAt(i));
                        for (int j = i; j < l-1; j++) {
                            sb.append("0");
                        }
                        sb.append(" ");
                    }
                }
                System.out.println(count);
                System.out.println(sb);
            }
        }
    }
}

/*
https://codeforces.com/problemset/problem/1352/A
*/
