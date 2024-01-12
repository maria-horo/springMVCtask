package nov20;

public class InvalidAgeException extends Exception{ 
	String str;
	    public InvalidAgeException (String str){   
	    	super(str);
	        this.str = str;
	    }  
}
