abstract class Employee{
	Employee abstract doWork();
	Employee abstract getSalary();
}                              
class Manager extends Employee{
	Manager doWork(){
		System.out.println("He manages the team.");
	}
	Manager getSalary(){
		System.out.println("He is being paid for managing the team.");
	}
}
class Admin extends Employee{
	Admin doWork(){
		System.out.println("He takes care of all the administrative work.");
	}
	Admin getSalary(){
		System.out.println("He is being paid for taking care of all the administrative work.");
	}
}
public class AbstractEmployeeDemo{
	static public void main(String... x){
		Manager manager = new Manager();
		manager.doWork();
		manager.getSalary();
		Admin admin = new Admin();
		admin.doWork();
		admin.getSalary();
	}
}