package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class IQTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        String[] nA = br.readLine().split("\\s+");
        int evenCount = 0,oddCount =0,evenIndex=0,oddIndex=0;
        for (int i = 0; i <n; i++) {
            int temp = Integer.parseInt(nA[i]);
            if(((temp & 1) == 0)){
                evenCount++;
                evenIndex = i;
            }else{
                oddCount++;
                oddIndex = i;
            }
        }
        System.out.println(oddCount<evenCount ? oddIndex+1 : evenIndex+1);
    }
}

//https://codeforces.com/problemset/problem/25/A
