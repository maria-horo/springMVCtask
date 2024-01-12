package nov11_flow_controls;

public class Pattern10_15 {
	
	void pattern1()
	{
		int rows = 5; // You can change the number of rows as needed

	    // Loop to iterate through rows
	    for (int i = 1; i <= rows; i++) {
	        // Loop to iterate through each number in the row
	        for (int j = 1; j <= i; j++) {
	            System.out.print(j + " ");
	        }
	        // Move to the next line after each row
	        System.out.println();
	    }

	}

	void SquareBoard()
	{
		  int n = 5; // You can change the value of n as needed

	      // Loop to iterate through rows
	      for (int i = 1; i <= n; i++) {
	          // Loop to iterate through columns
	          for (int j = 1; j <= n; j++) {
	              System.out.print("# ");
	          }
	          // Move to the next line after each row
	          System.out.println();
	      }
	}

	void patterUpsideDown()
	{
		int n=10;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				
			System.out.print("*");

	        }
			System.out.println();
		
		}
	}

	void coreNutsPattern() {
		String value= "corenuts";
		int n=value.length();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(value.charAt(j-1));
			}
			System.out.println();

			}
	}

	void tablesPattern()
	{
		 System.out.print("* |");
	     for (int i = 1; i <= 9; i++) {
	         System.out.print(" " + i);
	     }
	     System.out.println("\n-------------------------------");

	     // Print the multiplication table
	     for (int i = 1; i <= 9; i++) {
	         System.out.print(i + " |");
	         for (int j = 1; j <= 9; j++) {
	             System.out.print(" " + (i * j));
	         }
	         System.out.println();
	     }
	}

	
	public static void main(String[] args) {
		Pattern10_15 patterns = new Pattern10_15();
		patterns.pattern1();
		patterns.SquareBoard();
		patterns.patterUpsideDown();
		patterns.coreNutsPattern();
		patterns.tablesPattern();

	}
}
