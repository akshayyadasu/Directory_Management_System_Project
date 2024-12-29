public class Executives extends Person {
    
    private String department;

	public Executives(String last, String first, String middle, String department) {
		super(last, first, middle);
		this.department = department;
	}

	public String getDepartment()
	{
		return department;
	}
}
