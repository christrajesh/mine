package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testSum {
	
	static List<Integer> nums= new ArrayList() {{
		add(1);
		add(2);
		add(3);
		add(4);
		add(5);
		add(6);
		add(7);
		add(8);
		add(9);
		add(10);
	}};
	static int noOfNums=5;
	static int sum=25;
	static int maxDiff=2;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<nums.size();i++) {
			ArrayList<Integer> ar=new ArrayList<Integer>();
			ar.add(nums.get(i));
			testSum t=new testSum();
			t.findSum(ar, i);
		}
		
		
	}

	private void findSum(ArrayList<Integer> ar,int idx) {
		int s=sum(ar);
		if(s==sum)
		{
			System.out.println(ar);
		}else if(s<sum) {
			for(int i=idx+1;i<nums.size();i++)
			{
				
				if((nums.get(i)-ar.get(ar.size()-1))<=maxDiff) {
					ArrayList<Integer> lst=new ArrayList<Integer>(ar);
					lst.add(nums.get(i));
					findSum(lst, i);
				}
			}
		}
		}
	
	private int sum(ArrayList<Integer> ar) {
		int s=0;
		for(int i:ar)
			s+=i;
		return s;
	}
	
	
}
