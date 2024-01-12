package nov17Exception;

import java.io.FileWriter;
import java.io.IOException;


public class HandlingException implements ExceptionPrograms {
	
	@Override
	public void arrayIndex() {
		int[] array = new int[4];
		array[0] = 54;
		array[1] = 0;
		array[2] = 9;
		array[3] = 35;
		
		try {
			System.out.println(array[3]);
			System.out.println(array[0]);
			System.out.println(array[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public void divide() {
		int num1 = 50;
		int num2 = 0;		
		try {
			int div = num1 / num2;
			System.out.println(div);
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public void fileHandling() {
		FileWriter fwrite = null;
		try {
			fwrite = new FileWriter("\"D:\\Maria\\maria.txt\"");
			fwrite.write("The sun goes down...");
		} catch (IOException e) {
			System.out.println("Unexpected ERROR occured");
		}finally {
			try {
				fwrite.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	

	@Override
	public void arrayPropagation() throws Exception {
		int[] array = new int[4];
		array[0] = 54;
		array[1] = 0;
		array[2] = 9;
		array[3] = 35;
		
			System.out.println(array[3]);
			System.out.println(array[0]);
			System.out.println(array[4]);
	}
	
	@Override
	public void arrayNull() {
		   try {
			   int array[] = null;  
		        System.out.println("Length of array is: " + array.length);
		   }catch(NullPointerException e){
			   e.getMessage();
		   }
	}
	
	@Override
	public void variableNull() {
		int[] array = null;
		System.out.println(array[2]);
	}
	
	@Override
	public void multipleExceptions() {
		try {
			int[] array = null;
			System.out.println(array[2]);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally Block...!");
		}
		try {
			String str = null;
			System.out.println(str);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	@Override
	public void finallyWithoutCatch() {
		int[] array = new int[2];
		try {
			array[2] = 6;
		}finally {
			System.out.println("This array can contain only 2 elements");
			System.out.println("Finally block is executed");
		}
	}
	
	public void multipleExpIn1Catch() {
		try {
			int[] array = new int[10];
			array[10] = 10/0;
			System.out.println(array[5]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
