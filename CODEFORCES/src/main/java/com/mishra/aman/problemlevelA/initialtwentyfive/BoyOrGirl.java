package com.mishra.aman.problemlevelA.initialtwentyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

import static java.lang.System.in;

public class BoyOrGirl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String a = br.readLine();
        System.out.println(solution(a));
    }

    private static String solution(String a) {
        HashSet<Character> hs= new HashSet<>();
        for(Character cha : a.toCharArray()){
            hs.add(cha);
        }
        return hs.size()%2==0 ? "CHAT WITH HER!" : "IGNORE HIM!" ;
    }
}
/*
https://codeforces.com/problemset/problem/236/A
*/
