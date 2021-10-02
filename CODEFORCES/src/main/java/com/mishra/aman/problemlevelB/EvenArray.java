package com.mishra.aman.problemlevelB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class EvenArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int counter1 = 0,counter2 = 0;
            for (int i = 0; i < n; i++) {
                if(i%2 == 0){
                    if(Integer.parseInt(st.nextToken())%2 != 0){
                        counter1++;
                    }
                }else{
                    if(Integer.parseInt(st.nextToken())%2 != 1){
                        counter2++;
                    }
                }
            }
            System.out.println(counter1==counter2 ? counter1 : -1);
        }
    }
}


//https://codeforces.com/problemset/problem/1367/B