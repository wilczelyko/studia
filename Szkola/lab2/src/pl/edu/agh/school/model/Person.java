package pl.edu.agh.school.model;

import java.util.Collection;
import java.util.Objects;

public abstract class Person {
	public final String name;
	public final String surname;
	public Person(String name, String surname) {
		this.name = Objects.requireNonNull(name);
		this.surname = Objects.requireNonNull(surname);
	}
	
	@Override
	public String toString() {
		return name + " " + surname;
	}
	
	public abstract Collection<CourseTerm> getSchedule(); 
}
