package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class DesignTutorialLearnFromMath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        /*boolean[] primalityArray = new boolean[n+1];
        Arrays.fill(primalityArray,true);
        sieveofEratosthenes(primalityArray,n+1);
        for (int i = 4; i < n; i+=2) {
            if(!primalityArray[n-i]){
                System.out.println(i+ " "+ (n-i));
                break;
            }
        }*/
        solution(n);
    }

    private static void solution(int n) {
        if(n%2 == 0){
            System.out.println(n-4+" "+4);
        }else{
            System.out.println(n-9 +" " + 9);
        }
    }

    private static void sieveofEratosthenes(boolean[] primalityArray,int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(primalityArray[i]){
                for (int j = i*i; j < n; j+=i) {
                    primalityArray[j] = false;
                }
            }
        }
    }
}

//https://codeforces.com/problemset/problem/472/A
