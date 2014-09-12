package com.acordier.patterns;

/*
 * This is the message format we need to adapt to (new world)
 */
public class Message {
	
	private long timestamp;
	private String content;
	private String sender;
	private String recipient;
	
	public Message(String content, String sender, String recipient) {
		this.content = content;
		this.sender = sender;
		this.recipient = recipient;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	@Override
	public String toString() {
		return "Message [timestamp=" + timestamp + ", content=" + content
				+ ", sender=" + sender + ", recipient=" + recipient + "]";
	}		
}
