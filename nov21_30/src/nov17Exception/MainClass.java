package nov17Exception;

public class MainClass {

	public static void main(String[] args) throws Exception {
		ExceptionPrograms exp = new HandlingException();
		exp.arrayIndex();
		exp.divide();
		exp.fileHandling();
		exp.arrayPropagation();
		exp.arrayNull();
		exp.multipleExceptions();
		exp.finallyWithoutCatch();
		exp.multipleExpIn1Catch();
		
	}

}
