package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import static java.lang.System.in;

public class ChatRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s = br.readLine().toLowerCase(Locale.ROOT);
        int sl = s.length();
        char[] c = s.toCharArray();
        int hCount = 0,eCount = 0,lCount =0,oCount =0;
        for (int i = 0; i < sl; i++) {
            if(c[i]=='o' && lCount==2){
                oCount=1;
            }else if (c[i] == 'l' && lCount>=1) {
                lCount=2;
            }else if(c[i] == 'l' && eCount==1){
                lCount=1;
            }else if(c[i] == 'e' && hCount==1){
                eCount=1;
            }else if(c[i] == 'h'){
                hCount=1;
            }
        }
        System.out.println(
                hCount==1 && eCount==1 && lCount==2 && oCount==1 ? "YES" : "NO"
        );

    }
}
/* https://codeforces.com/problemset/problem/58/A */
