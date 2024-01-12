package lecture;

import java.util.concurrent.Executors;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inner klass");
			}
		});
		//lamda expression
		thread.start();
		Runnable runnable = () -> {
			System.out.println("Inner klass");
		};
		Thread thread2 = new Thread(runnable);
		thread2.start();

		Executors.newSingleThreadExecutor().submit(() -> {
			System.out.println("Inner klass");
			return "String";
		});

		//1
		MyInterface interface1 = (v1,v2) ->{
			double result = v1 * v2;
			return result;
		};
		
		LambdaTest test = new LambdaTest();
		test.execute((v1, v2) -> { 
			double result = v1 * v2;
			return result;
		});

		BiFunction<Double, Integer> biFunction = (v1, v2) -> {
			int result = Double.valueOf(v1*v2).intValue();
		};
		Integer apply = biFunction.apply(3.5, 6.7);
		System.out.println(apply);
		Predicate<String> predicate = (v1) -> {
			if("test".equalsIgnoreCase(v1)) {
				return true;
			}
			return false;
		};
		System.out.println(predicate.test("test1"));
		BiFunction<Double, Double, Double> interface3 = LambdaTest :: calculate;
		System.out.println(interface3.apply(12.45,12.5));
		
		//static method reference
		MyInterface interface2 = LambdaTest :: calculate;
		test.execute(interface2);
		//System.out.println(interface2.calculate(12.45, 12.5));
		
		//instance method reference
		BiFunction<Double, Double, Double> interface4 = new LambdaTest() :: calculate2;
		System.out.println(interface4.apply(12.45,12.5));
		
		Function<String, LambdaTest> function2 = LambdaTest :: new;
		function2.apply("test");
		
		Supplier<LambdaTest> function3 = LambdaTest :: new;
		function3.get();
	}
	public void execute(MyInterface myInterface) {
		double result = myInterface.calculate(10.5, 5.0);
		System.out.println(result);
	}
	public static Double calculate(Double v1, Double v2) {
		double result = v1 * v2;
		return result;
	}
	public Double calculate2(Double v1, Double v2) {
		double result = v1 * v2;
		return result;
	}
	public LambdaTest getInstance() {
		System.out.println("test");
		
	}

}
