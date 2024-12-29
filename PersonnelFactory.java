import java.util.Scanner;
public class PersonnelFactory {
    
    public static Person createPersonnel() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter last name: ");
        String last = scan.nextLine();
        
        System.out.println("Enter first name: ");
        String first = scan.nextLine();
        
        System.out.println("Enter middle name: ");
        String middle = scan.nextLine();

        System.out.println("Enter the type of person (1: Executive, 2: Volunteer, 3: Security, 4: Employee): ");
        int type = scan.nextInt();
        scan.nextLine();
        Person person = null;
        switch(type) {
            case 1:
                System.out.println("Enter Department: ");
                String department = scan.nextLine();
                person = new Executives(last, first, middle, department);
                break;
            case 2:
                System.out.println("Enter hours volunteered: ");
                int hoursVolunteered = scan.nextInt();
                scan.nextLine();
                person = new Volunteers(last, first, middle, hoursVolunteered);
                break;
            case 3:
                System.out.println("Enter working shift: ");
                String shift = scan.nextLine();
                person = new Security(last, first, middle, shift);
                break;
            case 4:
                System.out.println("Enter employee id : ");
                int empID = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter base salary" );
                double salary = scan.nextDouble();
                scan.nextLine();
                person = new Employee(last, first, middle, empID, salary);

            default:
                System.out.println("Invalid type. Please try again.");
                //createPerson();
                break;
        }
        
        return person;
    }
}
