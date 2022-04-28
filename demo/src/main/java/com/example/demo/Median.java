package com.example.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Median {
	
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int ik=sc.nextInt();
        int start=sc.nextInt();
        int end=sc.nextInt();
        int[] i1 = new int[ik];

        for(int i=1;i<i1.length;i++){
        System.out.println("Enter the array elements");
              i1[i]=sc.nextInt();
        }

        int[] i2=getSubArray(start,end,i1);
        System.out.println(i2/2);

    }

	private static int[] getSubArray(int start, int end, int[] inputArray) {
		 return inputArray.s
	}
}

