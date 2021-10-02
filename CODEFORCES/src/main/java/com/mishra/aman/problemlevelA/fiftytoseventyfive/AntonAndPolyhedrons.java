package com.mishra.aman.problemlevelA.fiftytoseventyfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class AntonAndPolyhedrons {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int t = Integer.parseInt(br.readLine()),tetrahedronCount = 0,cubeCount = 0,octahedronCount=0,
                dodecahedronCount = 0,icosahedronCount = 0;
        while (t-- > 0){
                String temp = br.readLine();
                if(temp.charAt(0) == 'T') tetrahedronCount++;
                if(temp.charAt(0) == 'C') cubeCount++;
                if(temp.charAt(0) == 'O') octahedronCount++;
                if(temp.charAt(0) == 'D') dodecahedronCount++;
                if(temp.charAt(0) == 'I') icosahedronCount++;
        }
        System.out.println(tetrahedronCount*4+cubeCount*6+octahedronCount*8+
                dodecahedronCount*12+icosahedronCount*20);
    }
}

//https://codeforces.com/problemset/problem/785/A
