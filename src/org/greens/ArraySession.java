package org.greens;

public class ArraySession {
	public void sample() {
		int a[]=new int[5];
		int b=30;
		a[0] = 10;
		a[1] = 20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(b);
		System.out.println(a[4]);
		//to show length
		int len = a.length;
		System.out.println(len);
		//iteration of array
		//for(int i = 0;i<a.length;i++)
	//	{
		//	System.out.println(a[i]);
	//	}
		//enhanced for
		for(int i : a)
		{
			System.out.println(i);
		}

	}
	public static void main(String[] args) {
		ArraySession k = new ArraySession();
		k.sample();
	}

}
