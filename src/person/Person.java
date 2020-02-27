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

public abstract class Person implements Work {
	private String lastName;
	private String firstName;

	/***
	 * Constructor for Person Object.
	 * 
	 * @param firstName First name
	 * @param lastName  Last name
	 */
	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}

	/***
	 * Copy constructor.
	 * 
	 * @param copy Copy of Person object
	 */
	public Person(Person copy) {
		this.setFirstName(copy.getFirstName());
		this.setLastName(copy.getLastName());

	}

	/***
	 * Get the last name
	 * 
	 * @return The last name
	 */
	public String getLastName() {
		return lastName;
	}

	/***
	 * Set the last name
	 * 
	 * @param lastName The last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/***
	 * Get the first name
	 * 
	 * @return The first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/***
	 * Set the first name
	 * 
	 * @param firstName The first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/***
	 * toString. Represents Person object as a String.
	 */
	public String toString() {
		return "Name: " + firstName + " " + lastName;
	}
}
