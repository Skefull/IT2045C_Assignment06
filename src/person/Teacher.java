package person;

public class Teacher extends Person {
	private boolean isWorking;
	
	public Teacher(String firstName, String lastName) {
		super(firstName, lastName);
		setFirstName(firstName);
		setLastName(lastName);
	}
	public void Work() {
		setIsWorking(true);
		System.out.println(super.getFirstName() + " " + super.getLastName() + " the teacher is working");
	}
	public void stopWorking() {
		setIsWorking(false);
		System.out.println(super.getFirstName() + " " + super.getLastName() + " the teacher has stopped working");
	}
	
	public boolean getIsWorking() {
		return isWorking;
	}
	public void setIsWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	public String toString() {
		return super.toString() + "\nOccupation: Teacher";
	}
}
