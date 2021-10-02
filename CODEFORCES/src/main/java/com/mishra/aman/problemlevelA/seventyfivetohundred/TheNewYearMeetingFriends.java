package com.mishra.aman.problemlevelA.seventyfivetohundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        Arrays.sort(a);
        System.out.println(a[2]-a[0]);
    }
}
/*
https://codeforces.com/problemset/problem/723/A
*/
