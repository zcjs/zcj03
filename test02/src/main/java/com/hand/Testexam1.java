package com.hand;
/*
 *  (8分)判断101-200之间有多少个素数，并输出所有素数。	输出结果格式如下:	
 */

import org.omg.Messaging.SyncScopeHelper;

public class Testexam1 {
public static void main(String[] args) {
	for(int i = 101; i < 201; i++)
	{
		boolean t = false;
		int sum = 0;
		for(int j=2; j <= i; j++)
		{
			if(i%j == 0)//zc
			{
				if(i != j)
				{
					t = false;
					break;
				}
			}
			else
			{
				t = true;
				sum= sum +1;
			}
		}
		
		if(t)
		{
		System.out.print(i+"\t");	
		}
	}
	
}
}


