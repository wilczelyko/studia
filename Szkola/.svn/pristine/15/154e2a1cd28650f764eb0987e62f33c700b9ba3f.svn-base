package pl.edu.agh.school.app;

import org.joda.time.LocalTime;
import org.joda.time.Minutes;

import pl.edu.agh.school.model.ConsoleMessageSerializer;
import pl.edu.agh.school.model.Course;
import pl.edu.agh.school.model.CourseTerm;
import pl.edu.agh.school.model.FileMessageSerializer;
import pl.edu.agh.school.model.Group;
import pl.edu.agh.school.model.Logger;
import pl.edu.agh.school.model.Person;
import pl.edu.agh.school.model.School;
import pl.edu.agh.school.model.Teacher;
import pl.edu.agh.school.model.WeekDay;

public class HogwartDemo {
	static ConsoleMessageSerializer consoleSrl;
	static FileMessageSerializer fileSrl;

	public static void main(String[] args) {
		consoleSrl = new ConsoleMessageSerializer();
		fileSrl = new FileMessageSerializer();
		
		Logger.LOGGER.register(consoleSrl);
		Logger.LOGGER.register(fileSrl);
		
		School school = new School("Hogwart");

		Group gryffindor = school.addGroup("Gryffindor");
		school.addStudent("Harry", "Potter", gryffindor);
		school.addStudent("Ron", "Weasley", gryffindor);
		school.addStudent("Hermione", "Granger", gryffindor);

		Group slytherin = school.addGroup("Slytherin");
		school.addStudent("Draco", "Malfoy", slytherin);
		school.addStudent("Gregory", "Goyle", slytherin);
		school.addStudent("Vincent", "Crabbe", slytherin);
		
		Teacher snape = school.addTeacher("Severus", "Snape");
		Teacher mcGonagall = school.addTeacher("Minerva", "McGonagall");
		Teacher hagrid = school.addTeacher("Rubeus", "Hagrid");
		Teacher flitwick = school.addTeacher("Filius", "Flitwick");
		
		Course potions = school.addCourse("Potions", snape, slytherin);
		Course charms = school.addCourse("Charms", flitwick, slytherin);
		Course transfiguration = school.addCourse("Transfiguration", mcGonagall, gryffindor);
		Course care = school.addCourse("Care of Magical Creatures", hagrid, gryffindor);

		potions.terms.add(new CourseTerm(WeekDay.MONDAY, new LocalTime(8, 30), Minutes.minutes(90)));
		charms.terms.add(new CourseTerm(WeekDay.TUESDAY, new LocalTime(10, 30), Minutes.minutes(90)));
		transfiguration.terms.add(new CourseTerm(WeekDay.WEDNESDAY, new LocalTime(8, 30), Minutes.minutes(90)));
		care.terms.add(new CourseTerm(WeekDay.THURSDAY, new LocalTime(11, 30), Minutes.minutes(90)));
		
		Util.printGroup(gryffindor);
		Util.printGroup(slytherin);
		Util.printSchedule(potions.terms, "potions");
	}
	
	public static int getTermCount(Person person) {
		return person.getSchedule().size();
	}

	public static void renderSchedule(Person person) {
		Util.printSchedule(person.getSchedule(), person.toString());
	}
}
