package que1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentList {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(456, "Troy", 50, "male", "mech", "patna", "bihar"));
		list.add(new Student(789, "Hannah Montana", 11, "female", "cse", "raipur", "chhattisgarh"));
		list.add(new Student(123, "Doraemon", 95, "male", "it", "ranchi","jharkhand"));
		list.add(new Student(56, "pikachu", 15, "male", "cse","ranchi","jharkhand"));
		list.add(new Student(12, "alex", 66, "female", "mech","raipur","chhattisgarh"));
		//1
		list.stream().map(e -> e.getName()).collect(Collectors.toList()).forEach((i)->System.out.println(i));
		//2
		Map<String, Long> genderCount = list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
		System.out.println("Male students: "+genderCount.getOrDefault("male", 0L));
		System.out.println("Female students: "+genderCount.getOrDefault("female", 0L));
		//3
		List<Student> cseStudent = list.stream().filter(student -> "cse".equals(student.getDepartment())).collect(Collectors.toList());
		System.out.println("CSE department students: ");
		cseStudent.forEach(student -> System.out.println(student.getName()));
		//4
		System.out.println("Student names categorized b department:");
		list.stream().collect(Collectors.groupingBy(Student::getDepartment,
				Collectors.mapping(Student::getName,
						Collectors.toList()))).entrySet().forEach((i)->System.out.println(i));
		//5
		System.out.println("List of female students from mechanical department:");
		List<String> femaleMechStudents = list.stream()
				.filter(student -> "female".equals(student.getGender()) && "mech".equals(student.getDepartment()))
				.map(Student::getName)
				.collect(Collectors.toList());
		femaleMechStudents.forEach(System.out::println);
		//6
		Map<String, Map<String, Long>> stateCityStudentCount = list.stream()
				.collect(Collectors.groupingBy(
						Student::getState,
						Collectors.groupingBy(Student::getCity, Collectors.counting())
						));

		// Display state and city-wise student counts
		stateCityStudentCount.forEach((state, cityMap) -> {
			System.out.println(state + " State:");
			cityMap.forEach((city, count) -> {
				System.out.println("  " + city + ": " + count + " students");
			});
			System.out.println();
		});
	}
}
