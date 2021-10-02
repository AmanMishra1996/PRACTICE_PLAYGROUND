package com.mishra.aman.problemlevelA.twentyfivetofifty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        String[] sA = br.readLine().split("\\s+");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(sA[i]);
        }
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE,minIndex = 0,maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if(array[i]>max){
                max = array[i];
                maxIndex = i;
            }
            if(array[i] <= min){
                min = array[i];
                minIndex = i;
            }
        }
        if(minIndex>maxIndex){
            System.out.println(maxIndex+n-minIndex-1);
        }else{
            System.out.println(maxIndex+n-minIndex-2);
        }
    }
}

//https://codeforces.com/problemset/problem/144/A
//https://codeforces.com/problemset/submission/144/9266130