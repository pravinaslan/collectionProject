package org.sample;

public class SumArray {
	public static void main(String[] args) {
		
		
	int [] ar=new int[10];
	int sum=0;
	ar[0]=1;
	ar[1]=2;
	ar[2]=3;
	ar[3]=4;
	ar[4]=5;
	ar[5]=6;
	ar[6]=7;
	ar[7]=8;
	ar[8]=9;
	ar[9]=10;
	
	
	
	for (int i = 0; i < ar.length; i++) {
		
		sum=sum+ar[i];
		
	}
	
	System.out.println("sum of array:" +sum);
	}
}
