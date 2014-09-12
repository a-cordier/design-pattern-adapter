package com.acordier.patterns;

public class LegacyMessage {
	private String recipient;
	private String content;
	
	public LegacyMessage(String recipient, String content) {
		this.recipient = recipient;
		this.content = content;
	}
	
	public String getRecipient() {
		return recipient;
	}
	
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "LegacyMessage [recipient=" + recipient + ", content=" + content
				+ "]";
	}
	
	
	
}
