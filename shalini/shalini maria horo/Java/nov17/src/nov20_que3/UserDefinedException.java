package nov20_que3;

public class UserDefinedException extends Exception {
	private String message;
	UserDefinedException(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
