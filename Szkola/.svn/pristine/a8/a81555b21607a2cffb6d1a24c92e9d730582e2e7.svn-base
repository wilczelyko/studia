package pl.edu.agh.school.model;

import java.util.Date;

import pl.edu.agh.school.app.Util;

public class FileMessageSerializer implements MessageSerializer {

	@Override
	public void serializeMessage(String message) {
		Util.appendToFile("Log.txt", "\t" + new Date() + " " + message + "\n");
	}

}
