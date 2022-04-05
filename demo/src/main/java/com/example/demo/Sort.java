package com.example.demo;

public class Sort {

	public static void main(String[] args) {

		int[] array=new int[4];
		int temp=0;
		array[0]=1;
		array[1]=4;
		array[2]=7;
		array[3]=3;
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
