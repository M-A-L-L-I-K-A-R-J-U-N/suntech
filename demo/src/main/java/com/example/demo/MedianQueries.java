
package com.example.demo;

import java.util.Scanner;

class MedianQueries {

	public static void main(String args[]) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int ik = sc.nextInt();
		int[] i1 = new int[ik];

		for (int i = 0; i < i1.length; i++) {
			System.out.println("Enter the array elements");
			i1[i] = sc.nextInt();
		}

		System.out.println("Enter the number of queries to process");
		int query = sc.nextInt();
		System.out.println("Enter the start of the array element");
		int start = sc.nextInt();
		System.out.println("Enter the end of the array element");
		int end = sc.nextInt();
		for (int z = 0; z < query; z++) {
			getSubArrayMedian(start, end, i1);
		}

	}

	private static void getSubArrayMedian(int start, int end, int[] inputArray) {
		int[] a1 = new int[inputArray.length];
		int k = 0;
		for (int j = start; j < end; j++) {
			a1[k++] = inputArray[j];
		}

		int temp = 0;
		for (int i = 0; i < a1.length; i++) {
			for (int l = i + 1; l < a1.length; l++) {
				if (a1[i] > a1[i + 1]) {
					temp = a1[i];
					a1[i] = a1[l];
					a1[l] = temp;

				}
			}
		}
		
		System.out.println("Median of given subArray is " +a1[a1.length / 2]);

	}
}