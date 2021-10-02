package com.mishra.aman.problemlevelA.initialtwentyfive;
/*
https://codeforces.com/problemset/problem/263/A
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class BeautifulMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int x = 0,y = 0;
        for (int i = 0; i < 5;i++){
            String s = br.readLine();
            if(s.contains("1")){
                String[] sA = s.split("\\s+");
                x = i;
                for (int j = 0; j < 5; j++) {
                    if(sA[j].equals("1")) y = j;
                }
                break;
            }
        }
        System.out.println(Math.abs(x-2)+Math.abs(y-2));
    }
}
