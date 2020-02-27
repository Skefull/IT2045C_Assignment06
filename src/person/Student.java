package person;

public class Student extends Person {

	private boolean isWorking;
	
	public Student(String firstName, String lastName) {
		super(firstName, lastName);
		setFirstName(firstName);
		setLastName(lastName);
	}
	public void Work() {
		setIsWorking(true);
		System.out.println(super.getFirstName() + " " + super.getLastName() + " the student is working");
	}
	public void stopWorking() {
		setIsWorking(false);
		System.out.println(super.getFirstName() + " " + super.getLastName() + " the student has stopped working");
	}

	public boolean getIsWorking() {
		return isWorking;
	}

	public void setIsWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	public String toString() {
		return super.toString() + "\nOccupation: Student";
	}

}
