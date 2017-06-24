package com.session2;

import java.util.Scanner;

	public class S2A1 {

		private static Scanner sc;
		
	    // This method prints the special character provided by user in X pattern
		public static void printX(int size, char display){
			for (int row = 0; row < size; row++){
				for(int col = 0; col < size; col++){
					if(row == col || row + col == size - 1){
						System.out.print(display);
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
				
			}
			
		}
		
		public static void main(String args[]){
			sc = new Scanner(System.in);
			System.out.println("Enter the Size");
			int x = sc.nextInt();
			System.out.println("Enter the special character to be displayed as X");
			char ch = sc.next().charAt(0);
			System.out.println("X pattern is displayed with "+ch);
			System.out.println();
			
			printX(x, ch);
			
		}
}

