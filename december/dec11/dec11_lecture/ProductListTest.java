package dec11_lecture;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cnts.bean.Product;

public class ProductListTest {

	public static void main(String[] args) {
		List<Product> products = new LinkedList<>();
		products.add(new Product(1,"mango",150));
		products.add(new Product(5,"amla",200));
		products.add(new Product(2,"apple",50));
		products.add(new Product(4,"banana",200));
		products.add(new Product(3,"guava",100));
		products.add(new Product(7,"avacado",50));
		products.add(new Product(6,"cherry",150));
		
		//products.stream().filter((e) -> e.getPrice() == 50).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		
		products.stream().sorted(new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().compareTo(p2.getName());
			}
		}).collect(Collectors.toList().forEach(e -> System.out.println(e)));
		
		products.stream().sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList()).forEach(e -> c);
		System.out.println("---------------------------");
		products.stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("---------------------------");
		products.stream().collect(Collectors.toMap((Product::getId), e -> e)).entrySet().stream().forEach(e -> System.out.println(e));
		System.out.println("---------------------------");
		long count = products.stream().filter((e) -> e.getPrice() == 50).collect(Collectors.toList()).stream().count();
		System.out.println(count);
		System.out.println("---------------------------");
		products.stream().collect(Collectors.toMap(Product::getId, e-> e)).entrySet().stream().map((e)-> e.getValue().getPrice()).collect(Collectors.summingDouble(e->e));
		System.out.println(totalPrice);
		System.out.println("---------------------------");
		Map<Double, List<Product>> groupMap = products.stream().collect(Collectors.groupingBy(e->getPrice()));
		groupMap.entrySet().stream().forEach(e-> {
			System.out.println("key - "+ e.getKey());
			e.getValue().stream().forEach(p -> System.out.println(p));
		});
		System.out.println("---------------------------");
		products.stream().collect(Collectors.groupingBy(Product::getPrice,Collectors.counting())).entrySet().forEach(e -> {
			System.out.println(e.getKey()+ "-"+e.getValue());
		});
		System.out.println("---------------------------");
		DoubleSummaryStatistics doubleSummaryStatistics = products.stream().collect(Collectors.summarizingDouble(Product::getPrice));
		System.out.println(doubleSummaryStatistics.getAverage());
		System.out.println(doubleSummaryStatistics.getMin());
		System.out.println(doubleSummaryStatistics.getMax());
		System.out.println(doubleSummaryStatistics.getSum());
		System.out.println(doubleSummaryStatistics.getCount());
		System.out.println("---------------------------");
		System.out.println(products.stream().map(e -> e.getPrice()).max(Comparator.naturalOrder()).get());
		System.out.println("---------------------------");
		System.out.println(products.stream().mapToDouble(Product::getprice).sum());
		
		//13Dec
//		products.stream().map(Product::getPrice).reduce((e1,e2) ->{
//			return e1+e2;
//		});
		Optional<Double> priceOptional = products.stream().map(Product::getPrice).reduce(Double::sum);
		System.out.println(priceOptional.get());
		System.out.println("---------------------------");
		//Double value = Double.valueOf(100), Double::sum)
	}
}
