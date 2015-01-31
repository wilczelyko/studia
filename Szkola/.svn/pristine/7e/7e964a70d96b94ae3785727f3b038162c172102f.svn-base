package pl.edu.agh.school.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class Student extends Person{

	private Group group;
	
	public Student(String name, String surname) {
		super(name, surname);
	}

	public void setGroup(Group group) {
		this.group = Objects.requireNonNull(group);
	}

	public Group getGroup() {
		return group;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Position: student";
	}

	@Override
	public Collection<CourseTerm> getSchedule() {
		Collection<CourseTerm> schedule = new HashSet<CourseTerm>(); 
		for (Course course : group.courses)
			schedule.addAll(course.terms);
		return schedule;
	}
}
