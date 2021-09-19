package com.csi;

public class StringTestApp {
	public static void main(String[] args) {
		
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
		finally {
			
			System.out.println("Hey");
			
			try
			{
				int res=10/0;
			}catch(ArithmeticException ee)
			{
				ee.printStackTrace();
			}
			System.out.println("WOWWW");
		}
	}
}
