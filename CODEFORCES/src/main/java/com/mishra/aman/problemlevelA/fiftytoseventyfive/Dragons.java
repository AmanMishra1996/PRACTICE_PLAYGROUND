package com.mishra.aman.problemlevelA.fiftytoseventyfive;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.System.in;

public class Dragons {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] nl = br.readLine().split("\\s+");
        int s = Integer.parseInt(nl[0]);
        int n = Integer.parseInt(nl[1]);
        int temp = n;
        Pair[] arr = new Pair[n];
        int index = 0;
        while(n-- > 0){
            String[] aA = br.readLine().split("\\s+");
            int l = Integer.parseInt(aA[0]);
            int g = Integer.parseInt(aA[1]);
            arr[index] = new Pair(l,g);
            index++;
        }
        Arrays.sort(arr, Comparator.comparingInt(p -> p.v1));
       /* Arrays.sort(arr, (p1, p2) -> p1.v1 - p2.v1);
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override public int compare(Pair p1, Pair p2)
            {
                return p1.v1 - p2.v1;
            }
        });*/
        for (int i = 0; i < temp; i++) {
            if(arr[i].v1 >= s){
                System.out.println("NO");
                return;
            }else{
                s += arr[i].v2;
            }
        }
        System.out.println("YES");
    }

    private static class Pair implements Comparable<Pair>{
        int v1;
        int v2;
        public Pair(int x,int y){
            this.v1 = x;
            this.v2 = y;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "v1=" + v1 +
                    ", v2=" + v2 +
                    '}';
        }

        @Override
        public int compareTo(Pair o) {
            return v1-o.v1;
        }
    }
}

/*
https://codeforces.com/problemset/problem/230/A
https://codeforces.com/problemset/submission/230/128413430
https://codeforces.com/problemset/submission/230/9273875
https://codeforces.com/problemset/submission/230/9135628
*/
