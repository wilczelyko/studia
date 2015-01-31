package pl.edu.agh.school.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;

public class Course {

	public final String name;
	public final Set<CourseTerm> terms = new HashSet<>();
	public final Set<Grade> grades = new HashSet<>();
	public final Set<Lesson> lessons = new HashSet<>();

	public final Group group;
	private Teacher teacher;

	Course(String name, Group group) {
		this.name = Objects.requireNonNull(name);
		this.group = Objects.requireNonNull(group);
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = Objects.requireNonNull(teacher);
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public Grade addGrade(Student student, GradeValue value, String description) {
		Grade grade = new Grade(student, value, description);
		grades.add(grade);
		return grade;
	}

	public Set<Grade> getGrades(Student student) {
		HashSet<Grade> hits = new HashSet<>();
		for (Grade grade : grades) {
			if (grade.student == student) {
				hits.add(grade);
			}
		}
		return hits;
	}

	public Lesson addLesson(LocalDate date, String topic) {
		Lesson lesson = new Lesson(date, topic);
		lessons.add(lesson);
		return lesson;
	}
	
	public CourseTerm addTerm(WeekDay day, LocalTime time, Minutes duration) {
		CourseTerm term = new CourseTerm(day, time, duration);
		terms.add(term);
		return term;
	}
}
