package activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamActivity {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random ran = new Random();
		for(int i = 0; i <= 2000; i++) {
			list.add(ran.nextInt(2000));
		}
		List<Integer> evenList = new ArrayList<Integer>();
		long time1 = System.currentTimeMillis();
		long sum = 0;
		for(int i = 0; i <= 2000; i++) {
			if(list.get(i) % 2 == 0) {
				evenList.add(list.get(i));
				sum = sum + list.get(i);
			}
		}
		//System.out.println("even summation: "+sum);
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
		System.out.println("---------------------------------");
		long time3 = System.currentTimeMillis();
		//System.out.println("start time: "+ time3);
		Integer l = list.stream().parallel().filter(i->i%2==0).parallel().reduce(0,(a,b) -> a+b);
		//System.out.println(l);
		//System.out.println("size of stream: "+l.size());
		long time4 = System.currentTimeMillis();
		//System.out.println("end time: "+ time4);
		System.out.println(time4 - time3);
		//Predicate<Integer>p = (num) -> num % 2 == 0; System.out.println(p.test(5));
		
	}

}
