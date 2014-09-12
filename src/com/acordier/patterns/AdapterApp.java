package com.acordier.patterns;

public class AdapterApp {
	/*
	 * Simple, straight forward adapter design pattern example
	 */
	public static void main(String[] args) {
		LegacyMessage legacyMessage = new LegacyMessage("bob", "a secret message");
		MessageServiceAdapter messageServiceAdapter = new MessageServiceAdapterImpl(legacyMessage, "Alice");
		messageServiceAdapter.postMessage();

	}

}
