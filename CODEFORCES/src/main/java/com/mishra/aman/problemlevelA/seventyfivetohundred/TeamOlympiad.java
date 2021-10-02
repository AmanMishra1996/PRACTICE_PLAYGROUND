package com.mishra.aman.problemlevelA.seventyfivetohundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class TeamOlympiad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, ArrayList<Integer>> hM = new HashMap<>();
        int count1 = 0, count2 = 0,count3 = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(temp == 1) count1++;
            if(temp == 2) count2++;
            if(temp == 3) count3++;
            if(hM.containsKey(temp)){
                ArrayList<Integer> list = hM.get(temp);
                list.add(i + 1);
                hM.put(temp,list);
            }else{
                int finalI = i+1;
                hM.put(temp,new ArrayList<Integer>(){{
                    add(finalI);
                }});
            }
        }
        int min = Math.min(Math.min(count1,count2),count3);
        if(min == 0){
            System.out.println(min);
        }else{
            System.out.println(min);
            int i = 0;
            while(min-- > 0){
                System.out.println(hM.get(1).get(i)+" "+hM.get(2).get(i)+" "+hM.get(3).get(i));
                i++;
            }

        }
    }
}

/*
https://codeforces.com/problemset/problem/490/A
https://codeforces.com/problemset/submission/490/10216607
*/
