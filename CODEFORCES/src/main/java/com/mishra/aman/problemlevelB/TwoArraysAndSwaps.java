package com.mishra.aman.problemlevelB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class TwoArraysAndSwaps {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] aA = new int[n];
            int[] bA = new int[n];
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int i = 0; i < n; i++) {
                aA[i] = Integer.parseInt(st.nextToken());
                sum += aA[i];
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                bA[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(k == 0 ? sum : solution(aA,bA,n,k,sum));
        }
    }

    private static int solution(int[] aA, int[] bA, int n, int k,int sum) {
        Arrays.sort(aA);
        Arrays.sort(bA);
        int j = n-1,counterswap = 0;
        for (int i = 0; i < n; i++) {
           if(aA[i] < bA[j]){
               sum +=(bA[j]-aA[i]);
               j--;
               counterswap++;
               if (counterswap==k){
                   break;
               }
           }else{
               break;
           }
        }
        return sum;
    }
}

//https://codeforces.com/problemset/problem/1353/B
//