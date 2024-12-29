public class Volunteers extends Person {
    
    private int hoursVolunteered;


    public Volunteers(String last, String first, String middle, int hoursVolunteered) {
		super(last, first, middle);
		this.hoursVolunteered = hoursVolunteered;
	}

    public int getHoursVolunteered() {
        return hoursVolunteered;
    }
}
