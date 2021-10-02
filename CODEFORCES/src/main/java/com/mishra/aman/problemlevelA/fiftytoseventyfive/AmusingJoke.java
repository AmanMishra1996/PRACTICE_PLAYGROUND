package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import static java.lang.System.in;

public class AmusingJoke {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        char[] aA = br.readLine().toCharArray();
        char[] bA = br.readLine().toCharArray();
        char[] cA = br.readLine().toCharArray();
        HashMap<Character,Integer> hM = new HashMap<>();
        for(char c : aA){
            if(hM.containsKey(c)){
                hM.put(c,hM.get(c)+1);
            }else{
                hM.put(c,1);
            }
        }
        for(char c : bA){
            if(hM.containsKey(c)){
                hM.put(c,hM.get(c)+1);
            }else{
                hM.put(c,1);
            }
        }
        for(char c : cA){
            if(hM.containsKey(c)){
                if(hM.get(c) ==1){
                    hM.remove(c);
                }else{
                    hM.put(c,hM.get(c)-1);
                }
            }else{
                System.out.println("NO");
                return;
            }
        }

        System.out.println(hM.size()==0 ?"YES" : "NO");
    }
}

//https://codeforces.com/problemset/problem/141/A
