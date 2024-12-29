import java.util.*;
public class Personnel {

	private ArrayList<Person> personList;

	public Personnel() {
	   personList = new ArrayList<Person>();
	}

	public void addPersonnel(Person person) {
		personList.add(person);
	}

	public void addIndividualNotFound(String lastN, String firstN) {
		Person p1  = new Person(lastN, firstN, " ");
		personList.add(p1);
	}

	public int getAmount() {
		return personList.size();
	}

	public Person findPerson(String last, String first) {
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).compareName(last, first)) {
				return personList.get(i);
			}
		}
		
		return null;
	}

	public void printNames(int order) {
		for(int i=0; i<personList.size(); i++) {
			personList.get(i).printName(order);
		}
	}
}