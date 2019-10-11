package com.cjc.app.stringcyclic;

public class CheckCyclicString 
{
	
		static boolean m1(String s1, String s2)
		{
		
		if(s1.length()!=s2.length())
		{
			System.out.println("String lenth does not matched");
			return false;
		}
		String con=s1+s1;
		if(con.indexOf(s2)!=-1)
		{
			System.out.println("String are rotations of each other");
			return true;
		}
		System.out.println("String are not rotations of each other");
		return false;
	}
		public static void main(String[] args) 
		{
			CheckCyclicString sc= new CheckCyclicString();
			String s1="ABCD";
			String s2="BCDA";
			sc.m1(s1, s2);
			
		}
	
}
