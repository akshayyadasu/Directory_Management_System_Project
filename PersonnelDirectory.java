import java.util.Scanner;
public class PersonnelDirectory {
	public static void main(String[] args) {
		Personnel per = new Personnel();
		PersonnelFactory factory = new PersonnelFactory();
		Scanner scan = new Scanner(System.in);
		String firstN, lastN, middleN;
		int empID;
		double salary;
		int choice = -1;

    	do {
			System.out.println("Welcome to the Personnel Directory Management System");
			System.out.println("====================================================");

			System.out.println("\n\n\t 1. Add Personnel");
			System.out.println("\n\t 2. Find Personnel");
			System.out.println("\n\t 3. Print Names");
			System.out.println("\n\t 4. Number of Entries in the Directory");

			System.out.println("\n\t Select one of the options above (1, 2, 3, 4)");
			choice = scan.nextInt();
			scan.nextLine();

			switch(choice) {
				case 1:
					Person individual = PersonnelFactory.createPersonnel();
					per.addPersonnel(individual);
					break;

				case 2:
					System.out.println("Enter first name : ");
					firstN = scan.nextLine();

					System.out.println("Enter last name : ");
					lastN = scan.nextLine();

					boolean found = false;
					int loc =-1;
					Person result = per.findPerson(lastN, firstN);

					if (result != null) {
						System.out.println("Found");
						result.firstMiddleLast();
					} else {
						System.out.println("not found");
						per.addIndividualNotFound(lastN, firstN);
						//total.objectAdded();
					}
					break;

				case 3:
					System.out.println("Enter the order 0: first, middle,  last, 1: first, last, middle, 2: last, first , middle ");
					int order = scan.nextInt();
					scan.nextLine();
					per.printNames(order);
					break;

				case 4:
					System.out.println("Total Entries : " + per.getAmount());
					break;
			}
		} while(true);
	}
}