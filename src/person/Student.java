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

public class Student extends Person {

	private boolean isWorking;

	/***
	 * Constructor for Student object
	 * 
	 * @param firstName First name
	 * @param lastName  Last name
	 */
	public Student(String firstName, String lastName) {
		super(firstName, lastName);
		setFirstName(firstName);
		setLastName(lastName);
	}

	/***
	 * States that Student object is working
	 */
	public void Work() {
		setIsWorking(true);
		System.out.println(super.getFirstName() + " " + super.getLastName() + " the student is working");
	}

	/***
	 * States that Student object has stopped working
	 */
	public void stopWorking() {
		setIsWorking(false);
		System.out.println(super.getFirstName() + " " + super.getLastName() + " the student has stopped working");
	}

	/***
	 * Get whether or not Student object is working
	 * 
	 * @return if Student object is working or not
	 */
	public boolean getIsWorking() {
		return isWorking;
	}

	/***
	 * Set if Student object is working
	 * 
	 * @param isWorking Shows if Student object is working
	 */
	public void setIsWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	/***
	 * toString. Represents Student object as a String.
	 */
	public String toString() {
		return super.toString() + "\nOccupation: Student";
	}

}
