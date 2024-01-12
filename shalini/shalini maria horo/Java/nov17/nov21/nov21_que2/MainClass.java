package nov21_que2;

public class MainClass {

	public static void main(String[] args) {
	
//		downcasting
//		Parent parent = new Son();
//		Son son1 = (Son) parent;
//		son1.career();
		
		Parent son = new Son();
		son.career();
		son.partner();
		
		Parent daughter = new Daughter();
		daughter.career();
		daughter.partner();
	}

}
