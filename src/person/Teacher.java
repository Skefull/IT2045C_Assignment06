/*
 * Name: Rob Kelly
 * Email: kelly2rb@mail.uc.edu
 * Course: IT2045C
 * Assignment #: 06
 * Due Date: 2/27/2020
 * Citations: N/A
 * Anything else: N/A
*/
package person;

public class Teacher extends Person {
	private boolean isWorking;

	/***
	 * Constructor class for Teacher.
	 * 
	 * @param firstName First Name
	 * @param lastName  Last Name
	 */
	public Teacher(String firstName, String lastName) {
		super(firstName, lastName);
		setFirstName(firstName);
		setLastName(lastName);
	}

	/***
	 * States that Teacher object is working
	 */
	public void Work() {
		setIsWorking(true);
		System.out.println(super.getFirstName() + " " + super.getLastName() + " the teacher is working");
	}

	/***
	 * States that Teacher object has stopped working
	 */
	public void stopWorking() {
		setIsWorking(false);
		System.out.println(super.getFirstName() + " " + super.getLastName() + " the teacher has stopped working");
	}

	/***
	 * Determine if Teacher object is working
	 * 
	 * @return if Teacher object is working
	 */
	public boolean getIsWorking() {
		return isWorking;
	}

	/***
	 * Set if Teacher object is working
	 * 
	 * @param isWorking shows if Teacher object is working
	 */
	public void setIsWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	/***
	 * toString. Represents Teacher object as a String
	 */
	public String toString() {
		return super.toString() + "\nOccupation: Teacher";
	}
}
