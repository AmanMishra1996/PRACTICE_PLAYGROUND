package com.mishra.aman.problemlevelA.initialtwentyfive;
/*
https://codeforces.com/problemset/problem/71/A
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

public class WayTooLongWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0){
            String s = br.readLine();
            int sl = s.length();
            if(sl > 10) {
                out.println(String.valueOf(s.charAt(0)) + (sl - 2) + s.charAt(sl - 1));
            } else {
                out.println(s);
            }
        }
    }
}
