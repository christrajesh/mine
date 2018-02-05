package mypackage;

import java.util.HashSet;
import java.util.Set;

public class MyPermutation {
	
	static int line=1;
	static Set<String> set=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ABH";
		
		int len=s.length();
		
		set=new HashSet<String>();
		permute(s,0,len-1);
		for(String i:set) {
			System.out.println(line+++" \t: "+ i);
		}
	}

	private static void permute(String s,int idx, int len) {
//		System.out.println("Permute funtion called :: "+s+" : "+idx+" : "+len);
		// TODO Auto-generated method stub
		if(idx==len) {
//			System.out.println(line+++" \t: "+ s);
			set.add(s);
		}else
			
			
		for(int i=idx;i<=len;i++) 
			{
			
			s=swap(s,idx,i);
			permute(s,idx+1,len);
			s=swap(s,idx,i);
		}
	}

	private static String swap(String s, int idx, int len) {
		// TODO Auto-generated method stub
		char[] c=s.toCharArray();
		char temp=c[idx];
		c[idx]=c[len];
		c[len]=temp;
		return String.valueOf(c);
		
	}

	
}
