package com.acordier.patterns;

public class AdapterApp {
	/*
	 * Simple, straight forward adapter design pattern example
	 * A legacy message system needs to adapt to a bit more sophisticated message system
	 * Adapter pattern will allow us to provide the legacy system with the capability to fit new world requirements
	 */
	public static void main(String[] args) {
		LegacyMessage legacyMessage = new LegacyMessage("bob", "a secret message");
		MessageServiceAdapter messageServiceAdapter = new MessageServiceAdapterImpl(legacyMessage, "Alice");
		messageServiceAdapter.postMessage();

	}

}
