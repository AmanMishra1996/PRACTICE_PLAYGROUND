package com.mishra.aman.problemlevelB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class BalancedArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- >0){
            int n =  Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            if((n/2)%2 != 0 ){
                System.out.println("NO");
            }else{
                for(int i = 0;i < n/2;i++){
                    sb.append(2+2*i).append(" ");
                }
                for (int i = 0; i < (n/2)-1; i++) {
                    sb.append(1+(2*i)).append(" ");
                }
                sb.append((n+(n/2)-1));
                System.out.println("YES");
                System.out.println(sb);
            }
        }
    }
}
//https://codeforces.com/problemset/problem/1343/B
