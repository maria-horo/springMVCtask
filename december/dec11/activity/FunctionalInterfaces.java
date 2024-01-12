package activity;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaces {
	public static void main(String[] args) {
		Supplier<Integer> p = () -> {
			Integer sum = 0;

			for (int i = 0; i < 5; i++) {
				if (i % 2 == 0) {
					sum = sum + i;
				}
			}
			return sum;
		};
		System.out.println(p.get());

		Function<Integer, Integer> f = (mul) ->{
			return mul*2;
		};
		System.out.println(f.apply(5));

		Consumer<Integer> c = (num) ->{
			for(int i=0; i<num; i++) {
				num = num+i;
			}
		};
		System.out.println(c.accept(Integer sum));
	}
}
