package pl.edu.agh.school.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.joda.time.LocalDate;

public class Lesson {

	public final LocalDate date;
	public final String topic;
	public final Set<Student> attendance = new HashSet<>();

	public Lesson(LocalDate date, String topic) {
		this.date = Objects.requireNonNull(date);
		this.topic = Objects.requireNonNull(topic);
	}
	
	public void noteAttendance(Student student) {
		attendance.add(student);
	}
}
