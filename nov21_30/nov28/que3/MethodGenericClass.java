package que3;

import java.util.ArrayList;
import java.util.List;

public class MethodGenericClass {

	<T> void add(T value){
		List <T>list=new ArrayList<>();
		list.add(value);
		for(T l1:list){
			System.out.println(l1);
		}
	}
	public static void main(String[] args) {
		MethodGenericClass methodGeneric=new MethodGenericClass();
		methodGeneric.<String>add("hello");
		methodGeneric.<Integer>add(10);
	}
}