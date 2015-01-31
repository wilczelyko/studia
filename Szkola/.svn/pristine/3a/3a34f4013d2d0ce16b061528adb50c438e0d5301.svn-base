package pl.edu.agh.school.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person{

	public final Set<Course> courses = new HashSet<>();

	Teacher(String name, String surname) {
		super(name, surname);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Position: teacher";
	}

	@Override
	public Collection<CourseTerm> getSchedule() {
		Collection<CourseTerm> schedule = new HashSet<CourseTerm>(); 
		for (Course course : courses)
			schedule.addAll(course.terms);
		return schedule;
	}
}
