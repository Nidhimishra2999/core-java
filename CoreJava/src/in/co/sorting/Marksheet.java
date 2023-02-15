package in.co.sorting;

public class Marksheet implements Comparable<Marksheet> {

	private String rollNo;
	String firstName;
	String lastName;
	int marks;

	public Marksheet(String rollNo, String firstName, String lastName, int marks) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public int compareTo(Marksheet o) {
		// TODO Auto-generated method stub
		return rollNo.compareTo(o.rollNo);
	}

	public String toString() {
		return rollNo + " , " + firstName + " , " + lastName + " , " + marks;
	}

}
