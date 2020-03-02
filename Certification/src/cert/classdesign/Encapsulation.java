package cert.classdesign;

/**One of the four fundamental object oriented programming concepts
 * inheritance ,polymorphism and abstraction*/
public class Encapsulation {
	
	/**Inmmutability , no setter methods , initialization through constructor*/
	
	public Encapsulation(Integer salary) {
		this.salary = salary;
	}

	private Integer salary;
	
	public void raiseSalary(Integer raiseAmmount) {
		this.salary=this.salary + raiseAmmount;
		
	}

}
