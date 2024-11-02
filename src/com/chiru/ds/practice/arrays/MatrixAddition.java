package com.chiru.ds.practice.arrays;

public class MatrixAddition {
	
	public static void main(String[] args) {
		
		int[][] a = {{1,3,5}, {2,1,4},{3,2,5}};
		
		int[][] b = {{1,3,5}, {2,1,4},{3,2,5}};
		
		
		int[][] c = new int[3][3];
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				c[i][j]= 
				
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for(int k=0;k<c.length;k++) {
			
			for(int l=0;l<c.length;l++) {
				
				System.out.print(c[k][l] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	

}
