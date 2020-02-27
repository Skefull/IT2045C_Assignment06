package main;

import person.Student;
import person.Teacher;

public class main {

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
