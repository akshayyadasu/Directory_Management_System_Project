public class Security extends Person{
    
    private String shift;

	public Security(String last, String first, String middle, String shift) {
		super(last, first, middle);
		this.shift = shift;
	}

	public String getShift()
	{
		return shift;
	}
}
