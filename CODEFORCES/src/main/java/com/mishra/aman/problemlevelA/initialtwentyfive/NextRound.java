package com.mishra.aman.problemlevelA.initialtwentyfive;
/*
https://codeforces.com/problemset/problem/158/A
https://codeforces.com/problemset/submission/158/127314961
https://codeforces.com/problemset/submission/158/9264539
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextRound {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sA = br.readLine().split("\\s+");
        int n = Integer.parseInt(sA[0]),k = Integer.parseInt(sA[1]);
        String[] sA1 = br.readLine().split("\\s+");
        System.out.println(nextRound(sA1,n,k));
    }
    public static int nextRound(String[] s,int n,int k){
        int ans =0;
        for(int i = 0;i < k;i++){
            if(s[i].equals("0")){
                return i;
            }
        }
        for(int i = k;i < n;i++){
            if(s[i].equals(s[i-1])) ans++;
            else break;
        }
        return ans+k;
    }
}
