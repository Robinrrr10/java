

public class Student {
	
	private String name;
	public int mk = 10;
	
	public Student() {
		System.out.println("This is constructor");
	}
	
	public void age(int a) {
		System.out.println("Age is:" + a);
		System.out.println("Name is:" + name);
	}
	
	private void mark() {
		System.out.println("Mark is: 98");
	}
	
	public String grade(String details) {
		System.out.println("graddd::" + details);
		return "9.1";
	}

}
