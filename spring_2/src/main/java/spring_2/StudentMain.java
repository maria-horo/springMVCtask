package spring_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configure.xml");
		Student student = (Student) context.getBean("student");
		System.out.println("Name : " + student.getName() );
		System.out.println("Age : " + student.getAge() );
	}

}
