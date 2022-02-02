package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	protected boolean isAsleep;
	private final String SLEEP_SOUND = "Zzzzz!";
	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
		isAsleep = false;
	}

	public String getSleepingSound() {
		return "Zzzz!";
	}

	public String getName( ) {
		return name;
	}
	public final String getSound( ) {
		if (isAsleep) {
			return SLEEP_SOUND;
		}
		else {
			return sound;
		}
	}

	public void singToSleep() {
		isAsleep = true;
	}

	public void wakeUp() {
		isAsleep = false;
	}


}