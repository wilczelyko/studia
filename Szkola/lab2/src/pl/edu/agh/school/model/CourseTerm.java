package pl.edu.agh.school.model;

import java.util.Objects;

import org.joda.time.LocalTime;
import org.joda.time.Minutes;

public class CourseTerm {

	public final WeekDay day;
	public final LocalTime time;
	public final Minutes duration;

	public CourseTerm(WeekDay day, LocalTime time, Minutes duration) {
		this.day = Objects.requireNonNull(day);
		this.time = Objects.requireNonNull(time);
		this.duration = Objects.requireNonNull(duration);
	}
}
