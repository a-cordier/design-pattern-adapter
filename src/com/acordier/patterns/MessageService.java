package com.acordier.patterns;

import java.util.Date;

/*
 * New world message service implementation
 */
public class MessageService implements Service {
	
	private String name;
	private String description;
	
	
	/* In new the world, services MUST provide a name an a description of themselves */
	public MessageService(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	public void postMessage(Message message){
		message.setTimestamp(new Date().getTime()); // in the new world messages are timestamped 
		System.out.println(message); // business logic to send a message in the new world
	}
}
