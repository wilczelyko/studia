package pl.edu.agh.school.model;

import java.util.ArrayList;

public enum Logger{
	LOGGER;

	ArrayList<MessageSerializer> handlers;

	private Logger(){
		handlers = new ArrayList<MessageSerializer>();
	}
	public void log(String message){
		for (MessageSerializer hand : handlers)
			hand.serializeMessage(message);
	}
	
	public void register(MessageSerializer handler){
		handlers.add(handler);
	}
}
