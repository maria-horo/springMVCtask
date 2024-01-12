package com.feuji;

public class Pattern {

	public void trianglePattern(int row) {
		int outerInput;
		int innerInput;

		for (outerInput = 0; outerInput < row; outerInput++) {  
			for (innerInput = row-outerInput; innerInput > 1; innerInput--)  {  
				System.out.print(" ");   
			}   
			//inner loop for columns  
			for (innerInput = 0; innerInput <= outerInput; innerInput++ )   {        
				System.out.print("* ");   
			}   
			System.out.println();   
		}      
	}

	public static void main(String[] args) {
		Pattern pattern = new Pattern();
		pattern.trianglePattern(5);
	}
}
