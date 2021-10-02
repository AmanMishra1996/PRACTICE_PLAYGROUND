package com.mishra.aman.problemlevelB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class TPrimes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int t = Integer.parseInt(br.readLine());
        String[] sA = br.readLine().split("\\s+");
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime,true);
        sieveofEratosthenes(isPrime);
        for (int i = 0; i < t; i++) {
            long num = Long.parseLong(sA[i]);
            if(num == 1L || num == 0L){
                System.out.println("NO");
                continue;
            }
            int index = (Math.sqrt(num)%1==0) ? (int)Math.sqrt(num) : 4;
            if(isPrime[index]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }

    private static void sieveofEratosthenes(boolean[] isPrime) {
        for(int i = 2; i < Math.sqrt(1000001); i++){
            if(isPrime[i]){
                for (int j = i*i; j < 1000001; j=j+i) {
                    isPrime[j] = false;
                }
            }
        }
    }

}

/*
https://codeforces.com/problemset/problem/230/B
*/

/*
TLE SOLUTION
public class TPrimes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int t = Integer.parseInt(br.readLine());
        String[] sA = br.readLine().split("\\s+");
        for (int i = 0; i < t; i++) {
            long num = Long.parseLong(sA[i]);
            int dC = 0;
            if(num < 4 || (num > 4 && (num & 1) ==0 )){
                System.out.println("NO");
                continue;
            }
            if(num == 4){
                System.out.println("YES");
                continue;
            }
            for(int j = 3;j <= Math.sqrt(num);j=j+2 ){
                if(num%j == 0) dC++;
                if(dC >= 2){
                    break;
                }
            }
            System.out.println(dC == 1 ? "YES" : "NO");

        }
    }
}
*/
