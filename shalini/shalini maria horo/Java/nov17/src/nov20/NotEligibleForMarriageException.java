package nov20;

public class NotEligibleForMarriageException extends RuntimeException{
	
	private String message;
	
	public NotEligibleForMarriageException (String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
