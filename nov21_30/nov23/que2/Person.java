package que2;
//2.Write a program that covers Constructor chaining ,this statement and super statement  
//  and this and super keywords.


public class Person {
    int age;
	char gender;
	String name;
	Person(int age, char gender){
		this.age = age;
		this.gender = gender;
	}
	Person(){
		this(0, 'f'); //calling 1st constructor
	}
	Person(String name){
		this(); //calling 2nd constructor
		this.name = name;
	}
	public String personInfo() {
		return "Person AGE: "+age+" GENDER: "+gender+"  NAME: "+name;
	}
}
