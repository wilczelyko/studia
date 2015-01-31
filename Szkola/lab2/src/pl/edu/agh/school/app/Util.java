package pl.edu.agh.school.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;

import pl.edu.agh.school.model.Course;
import pl.edu.agh.school.model.CourseTerm;
import pl.edu.agh.school.model.Group;
import pl.edu.agh.school.model.Person;
import pl.edu.agh.school.model.Student;

public class Util {

	public static void printGroup(Group group) {
		System.out.println("---------- GROUP ----------");
		System.out.format("\tGroup name: %s \n", group.name);

		System.out.println();
		System.out.println("---------- GROUP STUDENTS ----------");
		for (Student student : group.students) {
			System.out.format("\t" + student + "\n");
			renderSchedule(student);
		}

		System.out.println();
		System.out.println("---------- CLASS COURSES ----------");
		for (Course course : group.courses) {
			System.out.format("\tSubject name: %s \n", course.name);
			System.out.format("\tSubject teacher: %s %s\n",
					course.getTeacher().name, course.getTeacher().surname);
		}
		System.out.println();
	}

	public static void printSchedule(Collection<CourseTerm> terms,
			String description) {
		System.out.format("---------- SCHEDULE for %s  ----------\n",
				description);
		for (CourseTerm term : terms) {
			System.out.format("\tDay of week: %s \n", term.day);
			System.out.format("\tStart time: %s \n",
					term.time.toString("hh:mm"));
			System.out.format("\tEnd time: %s \n", term.time
					.plus(term.duration).toString("hh:mm"));
		}
		System.out.println();
	}

	public static void appendToFile(String fileName, String data) {
		try {
			Writer output = new BufferedWriter(new FileWriter(fileName, true));
			output.write(data);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int getTermCount(Person person) {
		return person.getSchedule().size();
	}

	public static void renderSchedule(Person person) {
		Util.printSchedule(person.getSchedule(), person.toString());
	}
}
