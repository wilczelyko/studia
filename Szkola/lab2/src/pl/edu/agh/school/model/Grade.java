package pl.edu.agh.school.model;

import java.util.Objects;

public class Grade {

	public final Student student;
	public final GradeValue value;
	public final String description;

	public Grade(Student student, GradeValue value, String description) {
		this.student = Objects.requireNonNull(student);
		this.value = Objects.requireNonNull(value);
		this.description = Objects.requireNonNull(description);
	}
}
