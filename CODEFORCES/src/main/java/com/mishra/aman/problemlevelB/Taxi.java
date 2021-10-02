package com.mishra.aman.problemlevelB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Taxi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        String[] sA = br.readLine().split("\\s+");
        int ans=0,ones =0,twos =0,threes=0;
        for(String s : sA){
            if(s.equals("1")){
                ones++;
            }else if(s.equals("2")){
                twos++;
            }else if(s.equals("3")){
                threes++;
            }else if(Integer.parseInt(s)>3){
                ans++;
            }
        }
        if(threes >= ones){
            ans +=ones +(threes-ones);
            ones = 0;
        }else {
            ans += threes;
            ones = ones - threes;
        }

        ans += (twos%2==0) ? twos/2 +(ones+3)/4: twos/2 + 1+ (ones+1)/4;
        System.out.println(ans);
    }
}

/*
https://codeforces.com/problemset/problem/158/B
*/
