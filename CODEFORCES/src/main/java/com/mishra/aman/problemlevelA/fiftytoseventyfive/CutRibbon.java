package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class CutRibbon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] nm = br.readLine().split("\\s+");
        int n = Integer.parseInt(nm[0]);
        int a = Integer.parseInt(nm[1]);
        int b = Integer.parseInt(nm[2]);
        int c = Integer.parseInt(nm[3]);
       // System.out.println(iterativeSolution(n,a,b,c));
        System.out.println(dpSolution(n,a,b,c));
    }

    private static int dpSolution(int n, int a, int b, int c) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            if(dp[i] != -1){
                if(i+a<=n){
                    dp[i+a] = Math.max(dp[i]+1,dp[i+a]);
                }
                if(i+b<=n){
                    dp[i+b] = Math.max(dp[i]+1,dp[i+b]);
                }
                if(i+c<=n){
                    dp[i+c] = Math.max(dp[i]+1,dp[i+c]);
                }
            }
        }
        return dp[n];
    }

    private static int iterativeSolution(int n, int a, int b, int c) {
        int ans = 0;
        for(int x = 0;x <= 4000;x++){
            for (int y = 0; y <=4000 ; y++) {
                int zc = n - (x*a+y*b);
                if(zc<0){
                    break;
                }
                double z = (zc/(double)c);
                if(z == (int)z){
                    ans = Math.max(ans,(int) (x+y+z));
                }
            }
        }
        return ans;
    }
}

/*
https://pythontutor.com/visualize.html#code=%0Aimport%20java.util.*%3B%0A%0Apublic%20class%20GFG%0A%7B%0A%20%20%20%20%0A%20%20%20%20//%20function%20to%20find%20the%20maximum%0A%20%20%20%20//%20number%20of%20segments%0A%20%20%20%20static%20int%20maximumSegments%28int%20n,%20int%20a,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20int%20b,%20int%20c%29%0A%20%20%20%20%7B%0A%20%20%20%20%20%20%20%20//%20stores%20the%20maximum%20number%20of%0A%20%20%20%20%20%20%20%20//%20segments%20each%20index%20can%20have%0A%20%20%20%20%20%20%20%20int%20dp%5B%5D%20%3D%20new%20int%5Bn%20%2B%2010%5D%3B%0A%0A%20%20%20%20%20%20%20%20//%20initialize%20with%20-1%0A%20%20%20%20%20%20%20%20Arrays.fill%28dp,%20-1%29%3B%0A%0A%20%20%20%20%20%20%20%20//%200th%20index%20will%20have%200%20segments%0A%20%20%20%20%20%20%20%20//%20base%20case%0A%20%20%20%20%20%20%20%20dp%5B0%5D%20%3D%200%3B%0A%0A%20%20%20%20%20%20%20%20//%20traverse%20for%20all%20possible%0A%20%20%20%20%20%20%20%20//%20segments%20till%20n%0A%20%20%20%20%20%20%20%20for%20%28int%20i%20%3D%200%3B%20i%20%3C%20n%3B%20i%2B%2B%29%0A%20%20%20%20%20%20%20%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%20%28dp%5Bi%5D%20!%3D%20-1%29%0A%20%20%20%20%20%20%20%20%20%20%20%20%7B%0A%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20//%20conditions%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20if%28i%20%2B%20a%20%3C%3D%20n%20%29%20//avoid%20buffer%20overflow%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20dp%5Bi%20%2B%20a%5D%20%3D%20Math.max%28dp%5Bi%5D%20%2B%201,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20dp%5Bi%20%2B%20a%5D%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20if%28i%20%2B%20b%20%3C%3D%20n%20%29%20//avoid%20buffer%20overflow%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20dp%5Bi%20%2B%20b%5D%20%3D%20Math.max%28dp%5Bi%5D%20%2B%201,%20%20%20%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20dp%5Bi%20%2B%20b%5D%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20if%28i%20%2B%20c%20%3C%3D%20n%20%29%20//avoid%20buffer%20overflow%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20dp%5Bi%20%2B%20c%5D%20%3D%20Math.max%28dp%5Bi%5D%20%2B%201,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20dp%5Bi%20%2B%20c%5D%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20return%20dp%5Bn%5D%3B%0A%20%20%20%20%7D%0A%0A%20%20%20%20//%20Driver%20code%0A%20%20%20%20public%20static%20void%20main%28String%20arg%5B%5D%29%0A%20%20%20%20%7B%0A%20%20%20%20%20%20%20%20int%20n%20%3D%207,%20a%20%3D%205,%20b%20%3D%202,%20c%20%3D%205%3B%0A%20%20%20%20%20%20%20%20System.out.print%28maximumSegments%28n,%20a,%20b,%20c%29%29%3B%0A%20%20%20%20%7D%0A%7D%0A%0A//%20This%20code%20is%20contributed%20by%20Anant%20Agarwal.&cumulative=false&curInstr=57&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
https://codeforces.com/problemset/problem/189/A

https://codeforces.com/problemset/submission/189/71926332
*/
