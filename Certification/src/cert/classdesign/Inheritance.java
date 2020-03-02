package cert.classdesign;

public class Inheritance extends Encapsulation {

	public Inheritance(Integer salary,String name) {
		super(salary);
		this.name=name;
	}
	
	private String name;
	
	public void changeName(String newName) {
		this.name=newName;
		
	}
	
class Test{
	
	public void test() {
	Encapsulation test1= new Inheritance(2000,"Matt");
	test1.raiseSalary(2000);
	//test1.changeName("Albert");
	
	Inheritance test2 = new Inheritance(2000,"Peter");
	test2.raiseSalary(2000);
	test2.changeName("Albert");
	
	Inheritance test3=(Inheritance) test1;
	test3.changeName("Sussie");
	
	
	}
}
}
