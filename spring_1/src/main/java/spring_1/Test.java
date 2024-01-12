package spring_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext classPath = new ClassPathXmlApplicationContext("configure.xml");
		Vehicle gaadi = (Vehicle) classPath.getBean("vehicle");
		System.out.println(gaadi);
	}

}
