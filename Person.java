public class Person {
	private String last;
	private String first;
	private String middle;

	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;

	}

	public boolean compareName(String lastN, String firstN) {
		if (last.equals(lastN) && first.equals(firstN)) {
			return true;
		} else {
			return false;
		}
	}

	public void firstMiddleLast() {
		System.out.println(first + "  " + middle + "  " + last);
	}

	public void firstLastMiddle() {
		System.out.println(first + " ," + last+ " " + middle);
	}

	public void lastFirstMiddle() {
		System.out.println(last + " ," + first + " " + middle);
	}

	
	public void printName(int order) {
		if (order == 0) {
			System.out.println(first + "  " + middle + "  " + last);
		} else if (order == 1) {
			System.out.println(first + " ," + last+ " " + middle);

		} else if(order == 2) {
			System.out.println(last + " ," + first + " " + middle);
		}
	}
	
}