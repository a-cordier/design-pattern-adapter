package com.acordier.patterns;

import java.util.Date;
/*
 * Enforcing adapter pattern using composition rather than inheritance 
 */
public class MessageServiceAdapterImpl implements MessageServiceAdapter{
	
	private LegacyMessage legacyMessage;
	private String sender;
	
	public MessageServiceAdapterImpl(LegacyMessage legacyMessage, String sender){
		this.legacyMessage = legacyMessage;
		this.sender = sender;
	}
	
	@Override
	public void postMessage() {
		Message message = new Message(legacyMessage.getContent(), null, legacyMessage.getRecipient());
		message.setSender(this.sender);
		message.setTimestamp(new Date().getTime());		
		new MessageService("adapted message service", "sending a legacy messaage adapted for the new world").postMessage(message);
	}

}
