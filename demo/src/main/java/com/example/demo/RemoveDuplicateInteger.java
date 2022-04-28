package com.example.demo;

public class RemoveDuplicateInteger {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 3, 3, 24, 3, 4 };

		int[] temp = new int[arr.length];
		int j = 0;

		int[] sortedArray = sort(arr);
		for (int i = 0; i < sortedArray.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}

		for (int k = 0; k < temp.length; k++) {
			if(temp[k] == 0) {
				break;
			}else {
			System.out.println(temp[k]);
			}
		}
	}
	
	public static int[] sort(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
	}

}
