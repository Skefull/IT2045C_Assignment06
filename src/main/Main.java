/*
 * Name: Rob Kelly
 * Email: kelly2rb@mail.uc.edu
 * Course: IT2045C
 * Assignment #: 06
 * Due Date: 2/27/2020
 * Citations: N/A
 * Anything else: N/A
*/
package main;

import person.Student;
import person.Teacher;

public class Main {

	public static void main(String[] args) {
		Teacher nicholson = new Teacher("Bill", "Nicholson");
		Student rob = new Student("Rob", "Kelly");
		System.out.println(nicholson.toString());
		nicholson.Work();
		System.out.println("Working? " + nicholson.getIsWorking());
		nicholson.stopWorking();
		System.out.println("Working? " + nicholson.getIsWorking());
		System.out.println("\n" + rob.toString());
		rob.Work();
		System.out.println("Working? " + rob.getIsWorking());
		rob.stopWorking();
		System.out.println("Working? " + rob.getIsWorking());

	}

}
