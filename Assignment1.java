package myTrails;

import java.util.Arrays;

public class Assignment1 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(a));
		a=shuffle(a);
		System.out.println(Arrays.toString(a));
	}
	public static int[] shuffle(int[] a)
	{
		int[] b=new int[a.length];
		int i=a.length-1,j=0;
		while(i>=0)
			b[j++]=a[i--];
		
		if(a.length%2 != 0)
		{
			int temp=b[0];
			b[0]=b[b.length/2];
			b[b.length/2]=temp;	
		}
		return b;
	}
}
