package nov17Exception;
/*
1. Write a program to handle exception using try and catch block
2. Write a program to raise ArithemticException and then handle 
   that using try, catch blocks
3. Write a program to handle the exception in try, catch, finally blocks?
4. Write a program to handle the exception in finally
   without using catch block?
5. Write a program to handle multiple/specific exceptions using
   different catch blocks.
6. Write a program to handle multiple exceptions in a single catch block
7. Write a program to show exception propagation.
8. Write a program to throw NullPointerExeption
9. Write a program not to throw NullPointerException, needs to write 
   the piece of code to achieve.
10. Write a program to handle the multiple exceptions using multiple 
    try/catch/finally in same method?
*/


public interface ExceptionPrograms {
	void arrayIndex();//1,5
	void divide();//2
	void fileHandling();//3
	void finallyWithoutCatch();//4
	void arrayPropagation() throws Exception;//7
	void arrayNull(); //8
	void variableNull();//9
	void multipleExceptions();//10
	void multipleExpIn1Catch();//6
}
