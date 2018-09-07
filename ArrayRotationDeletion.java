/* This is the solution to a problem I found interesting in Geeks for Geeks. 
This solutions works well for most of the test cases, but it takes a toll on the runtime.
I'm thinking of ways to optimize the code to reduce the runtime. 
Link to the problem - https://practice.geeksforgeeks.org/problems/rotate-and-delete/0
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class ArrayRotationDeletion
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		int count=0;
		int num=sc.nextInt();
		List<Integer> h=new ArrayList();
		for(int i=0;i<num;i++)
		{
		    n=sc.nextInt();
		    h.add(n);
		}
		while(h.size()>1)
		{
		    h=rotate(h);
		    if(count>=h.size())
		        h.remove(0);
		    else
		    {     
		        h.remove(h.size()-1-count);
		        count++;
		    }
		  
		}
		    for(int j=0;j<h.size();j++)
		{
		    System.out.print(h.get(j)+" ");
		}
		
	}
	public static List<Integer> rotate(List<Integer> a)
	{
	    int a1=a.get(a.size()-1);
		a.add(0,a1);
		a.remove(a.size()-1);
		return a;
	}
}
