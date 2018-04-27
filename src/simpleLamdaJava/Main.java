package simpleLamdaJava;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Employee agung = new Employee("agung", 31);
		Employee budi = new Employee("budi", 32);
		Employee cahyo = new Employee("cahyo", 33);
		Employee dono = new Employee("dono", 34);
		
		List<Employee> employee = new ArrayList<>();
		employee.add(agung);
		employee.add(budi);
		employee.add(cahyo);
		employee.add(dono);
		
//		// using lamda on sorting  collections
//		Collections.sort(employee, (employee1,employee2) -> employee1.getName().compareTo(employee2.getName()));
//		
//		System.out.println("Employee list : ");
//		for(Employee emp: employee) {
//			System.out.println(emp.getName());
//		}
//		
//		// run concat
//		UpperConcat uc = (s1,s2) -> s1.toUpperCase() + " dan "+ s2.toUpperCase();
//		String tempString = doStringStuff(uc, employee.get(0).getName(), employee.get(1).getName());
//		System.out.println(tempString);
		
		AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
	}
	
	public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
		return uc.upperAndConcat(s1, s2);
	}
}

class Employee{
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

interface UpperConcat{
	public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
	public String doSomething() {
//		int i = 0;
		UpperConcat uc = (s1,s2) -> {
			System.out.println("The lambda expression's class is "+ getClass().getSimpleName());
			String result = s1.toUpperCase() + " and " + s2.toUpperCase();
			return result;
		};
		System.out.println("The Another class's name is "+ getClass().getSimpleName());
		return Main.doStringStuff(uc, "String1", "String2");
	}
}
