package com.mishra.aman.problemlevelC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import static java.lang.System.in;

public class RegistrationSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int t = Integer.parseInt(br.readLine());
        HashMap<String,Integer> hM = new HashMap<>();
        while (t-- > 0){
            String temp = br.readLine();
            if(hM.containsKey(temp)){
                int x  = hM.get(temp);
                System.out.println(temp+""+x);
                hM.put(temp,x+1);
            }else{
                hM.put(temp,1);
                System.out.println("OK");
            }
        }
    }
}

//https://codeforces.com/problemset/problem/4/C
