package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
          List<Integer> resInnerList=new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j] == 0){
                        resInnerList.add(Integer.valueOf(nums[i]));
                        resInnerList.add(Integer.valueOf(nums[j]));
                        break;
                    }
                }
        }
        res.add(resInnerList);
		return res;
    }
	
	public static void main(String[] args) {
		int[] nums=new int[] {-1,0,1,2,-1,-4};
		threeSum(nums);
	}

}
