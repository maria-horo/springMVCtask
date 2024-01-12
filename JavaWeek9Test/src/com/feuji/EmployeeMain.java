package com.feuji;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1, "Ram", 32, "Male", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Sita", 25, "Female", "Marketing", 2015, 13500.0));
		employeeList.add(new Employee(3, "Murali", 29, "Male", "Sales", 2012, 18000.0));
		employeeList.add(new Employee(4, "Mahesh", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Preethi", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Gopi", 43, "Male", "Accounts", 2016, 10500.0));
		employeeList.add(new Employee(7, "Kamal", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "AKhila", 24, "Female", "Marketing", 2016, 11500.0));
		employeeList.add(new Employee(10, "Arjun", 38, "Male", "Sales", 2015, 11000.5));

		//1. How many male and female employees are there in the organization
//		long maleCount = employeeList.stream().filter(employee -> employee.getGender().
//				equalsIgnoreCase("Male")).count();
//		long femaleCount = employeeList.stream().filter(employee -> employee.getGender().
//				equalsIgnoreCase("Female")).count();
//		System.out.println("Number of male employees: "+ maleCount);
//		System.out.println("Number of female employees: "+ femaleCount);
//		System.out.println();
		
		Map<String, Long> noOfMaleAndFemaleEmployees = 
		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);
		System.out.println();

		//another method
		//		Map<String, Long> noOfMaleAndFemaleEmployees=
		//				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));       
		//				System.out.println(noOfMaleAndFemaleEmployees);
		//		System.out.println();		

		//2. Print the name of all departments in the organization
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		System.out.println();

		//3. Get the details of highest paid employee in the organization (By Using Optional)
		Optional<Double> optional=employeeList.stream().map(i->i.getSalary()).sorted(Comparator.reverseOrder()).findFirst();
		System.out.println("Highest Paid Employee :"+ optional.get());


		//4. Get the names of all employees who have joined after 2015
		employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015).map(Employee::getName)
		.forEach(System.out::println);

		//5. Get the details of youngest male employee in the Development department (By Using Optional)
		Optional<Employee> optionalYoungest = employeeList.stream().filter(i->i.getGender().equals("Male")).sorted(Comparator.comparing(Employee::getAge)).
				filter(i->i.getDepartment().equals("Development")).findFirst();
		System.out.println("Yongest Employee details :"+ optionalYoungest.get());
		System.out.println();

		//6. How many male and female employees are there in the sales and marketing team
		Map<String, Long> countMaleFemaleEmployeesInSalesMarketing =
				employeeList.stream().filter(employee -> employee.getDepartment()=="Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(countMaleFemaleEmployeesInSalesMarketing);
		System.out.println();

		//7. List down the names of all employees in each department
		Map<String, List<Employee>> employeeListByDepartment=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));       
		Set<Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();        
		for (Entry<String, List<Employee>> entry : entrySet) {
			System.out.println("Employees In "+entry.getKey() + " : ");       
			List<Employee> list = entry.getValue();      
			for (Employee e : list) {
				System.out.println(e.getName());
			}
		}
	}
}
