class Speaker implements Speaker_Interface {
	boolean power = false;
	boolean mute = false;
	boolean sound = false; // 0 for stereo/poweroff and 1 for mono
	int volume = 0;

	public void power(boolean value) {
		power = value;
	}

	public void mute(boolean value) {
		mute = value;
	}

	public void sound(boolean value) {
		sound = value;
	}

	public void volumeUp(int value) {
		volume += 10*value;
	}

	public void volumeDown(int value) {
		volume -= 10*value;
	}

	void printOut() {
		if (power) {
			if (!mute) {
				System.out.println("Speaker is powered on & not on mute with its volume " + volume + " " + sound);
			}
			else {
				volume = 0;
				System.out.println("Speaker is powered on but muted (volume = " + volume + " " + sound + ")");
			}
		}
		else {
			volume = 0;
			mute = false;
			System.out.println("Speaker is powered off");
		}
	}
}
