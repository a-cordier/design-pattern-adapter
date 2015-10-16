package com.acordier.patterns;

/*
 * Legacy message service (in the legacy world we don't use interfaces)
 */
public class LegacyMessageService {
	public void postMessage(LegacyMessage legacyMessage){
		System.out.println(legacyMessage); // business logic to send a message in the legacy world
	}
}
