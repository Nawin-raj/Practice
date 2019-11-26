package Solutions;

import java.time.LocalDate;

public class Employee {
	String name;
	int age;
	LocalDate dob;
	String city;
	double salary;

	public Employee() {

	}

	public Employee(String name, int age, LocalDate dob, String city, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + ", age=" + age + ", dob=" + dob + ", city=" + city + ", salary=" + salary
				+ " ";
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// setting values use Setters
		LocalDate d1 = LocalDate.of(2019, 11, 26);
		LocalDate d2 = LocalDate.of(2019, 11, 27);
		LocalDate d3 = LocalDate.of(2019, 11, 28);
		LocalDate d4 = LocalDate.of(2019, 11, 29);
		LocalDate d5 = LocalDate.of(2019, 11, 30);
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		// Employee 1
		e1.setName("AAA");
		e1.setAge(22);
		e1.setDob(d1);
		e1.setCity("Pune");
		e1.setSalary(25000);
		// Employee 2
		e1.setName("BBB");
		e1.setAge(22);
		e1.setDob(d2);
		e1.setCity("Pune");
		e1.setSalary(25000);
		// Employee 3
		e1.setName("CCC");
		e1.setAge(22);
		e1.setDob(d3);
		e1.setCity("Pune");
		e1.setSalary(25000);
		// Employee 4
		e1.setName("DDD");
		e1.setAge(22);
		e1.setDob(d4);
		e1.setCity("Pune");
		e1.setSalary(25000);
		// Employee 5
		e1.setName("EEE");
		e1.setAge(22);
		e1.setDob(d5);
		e1.setCity("Pune");
		e1.setSalary(25000);
		System.out.println(e1);
		// Setting values using Constructor
		Employee emp1 = new Employee(e1.getName(), e1.getAge(), e1.getDob(), e1.getCity(), e1.getSalary());
		Employee emp2 = new Employee(e2.getName(), e2.getAge(), e2.getDob(), e2.getCity(), e2.getSalary());
		Employee emp3 = new Employee(e3.getName(), e3.getAge(), e3.getDob(), e3.getCity(), e3.getSalary());
		Employee emp4 = new Employee(e4.getName(), e4.getAge(), e4.getDob(), e4.getCity(), e4.getSalary());
		Employee emp5 = new Employee(e5.getName(), e5.getAge(), e5.getDob(), e5.getCity(), e5.getSalary());
		System.out.println(emp1);
	}

}
