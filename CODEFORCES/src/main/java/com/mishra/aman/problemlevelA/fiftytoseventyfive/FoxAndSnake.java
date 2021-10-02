package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class FoxAndSnake {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] nm = br.readLine().split("\\s+");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        StringBuilder a= new StringBuilder();
        StringBuilder b= new StringBuilder();
        StringBuilder c= new StringBuilder();
        boolean turnLeft = true;
        for (int i = 0; i < m; i++) {
            a.append("#");
            if(i == m-1){
                b.append("#");
            }else{
                b.append(".");
            }
            if(i == 0){
                c.append("#");
            }else{
                c.append(".");
            }
        }
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                System.out.println(a);
            }else if(turnLeft){
                System.out.println(b);
                turnLeft = false;
            }else{
                System.out.println(c);
                turnLeft = true;
            }
        }
    }
}

//https://codeforces.com/problemset/problem/510/A