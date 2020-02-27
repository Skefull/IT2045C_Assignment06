package person;

public abstract class Person implements Work {
	private String lastName;
	private String firstName;
	
	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	public Person(Person copy) {
		this.setFirstName(copy.getFirstName());
		this.setLastName(copy.getLastName());
		
		
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName;
	}
}
