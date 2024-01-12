package nov20;

import org.junit.jupiter.api.Test;

public class TestClass {
	JavaClasses java = new JavaClasses();
	@Test
	public void tests() {

		try {
			java.marriageAge();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//	@Test
	//	public void test2() {
	//		int r = java.add();
	//		assertEquals(r,50);
	//	}
}
