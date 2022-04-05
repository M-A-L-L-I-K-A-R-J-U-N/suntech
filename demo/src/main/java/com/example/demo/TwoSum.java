package com.example.demo;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
	outer:	for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j] == target) {
					result[0]=i;
					result[1]=j;
					break outer;
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] nums=new int[] {3,2,4};
		twoSum(nums, 6);
		
	}

}
