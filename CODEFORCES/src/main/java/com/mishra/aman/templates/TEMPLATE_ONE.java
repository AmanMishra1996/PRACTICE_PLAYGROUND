package com.mishra.aman.templates;

import java.util.Arrays;
import java.util.Comparator;

public class TEMPLATE_ONE {
    public static void main(String[] args) {
        Pair[] arrOne = new Pair[10];
        Arrays.sort(arrOne, (p1, p2) -> p1.v1 - p2.v1);
        Arrays.sort(arrOne, new Comparator<Pair>() {
            @Override public int compare(Pair p1, Pair p2)
            {
                return p1.v1 - p2.v1;
            }
        });
        int[][] arr = new int[4][4];
        TEMPLATE_ONE.sortbyColumn(arr,0);

    }
    public static void sortbyColumn(int arr[][], final int col){
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            // Compare values according to columns
            public int compare(final int[] entry1, final int[] entry2) {

                // To sort in descending order revert
                // the '>' Operator
                if (entry1[col] > entry2[col])
                    return 1;
                if(entry1[col] < entry2[col])
                    return -1;
                return 0;
            }
        });  // End of function call sort().
    }
    private static class Pair {
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
    }
}

//https://codeforces.com/problemset/submission/230/54335779
//https://codeforces.com/problemset/submission/339/9135621
//https://codeforces.com/problemset/submission/750/23421649

