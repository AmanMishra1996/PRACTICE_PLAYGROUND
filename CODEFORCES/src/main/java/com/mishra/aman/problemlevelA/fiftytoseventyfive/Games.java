package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.in;

public class Games {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int t = Integer.parseInt(br.readLine());
        HashMap<String,Integer> hCM = new HashMap<>();
        HashMap<String,Integer> gCM = new HashMap<>();
        while (t-- >0){
            String[]  hg = br.readLine().split("\\s+");
            if(hCM.containsKey(hg[0])){
                hCM.put(hg[0],hCM.get(hg[0])+1);
            }else{
                hCM.put(hg[0],1 );
            }
            if(gCM.containsKey(hg[1])){
                gCM.put(hg[1],gCM.get(hg[1])+1);
            }else{
                gCM.put(hg[1],1 );
            }
        }
        int ans = 0;
        for (Map.Entry mapElement : hCM.entrySet()) {
            String key = (String) mapElement.getKey();
            int value = ((int)mapElement.getValue());
            if(gCM.containsKey(key)){
                ans += (value*gCM.get(key));
            }
        }
        System.out.println(ans);
    }
}
