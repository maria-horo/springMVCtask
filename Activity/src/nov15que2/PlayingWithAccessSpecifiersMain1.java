package nov15que2;

import nov15.PlayingWithAccessSpecifiers;

public class PlayingWithAccessSpecifiersMain1 {

	public static void main(String[] args) {
		
		PlayingWithAccessSpecifiers as = new PlayingWithAccessSpecifiers();
		
		as.method1();//public
		//as.method2();//protected
		//as.method3();//default
		//as.method4();//private -- not visible
		
		System.out.println(as.age);
		//System.out.println(as.gender);//protected
		//System.out.println(as.hairColor);//default
		System.out.println(as.getSalary());//private -- not visible
	}

}
