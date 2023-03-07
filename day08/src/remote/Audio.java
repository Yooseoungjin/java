package remote;

public class Audio implements Remote {

	@Override
	public void turnOn() {
		System.out.println("Turn on AUDIO");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off AUDIO");
	}
}
