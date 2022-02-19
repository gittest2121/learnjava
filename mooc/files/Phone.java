class Phone {

	private String Phone1;
	private String Phone2;
	private int NoOfCamerasinPhone1;
	private int NoOfCamerasinPhone2;

	// Data in specific format
	// Phone1, Phone2, NoofCamerasinPhone1, NoofCamerasinPhone2
	public Phone(String Phone1, String Phone2, int cam1, int cam2) {
		this.Phone1 = Phone1;
		this.Phone2 = Phone2;
		this.NoOfCamerasinPhone1 = cam1;
		this.NoOfCamerasinPhone2 = cam2;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	String WhoWins() {
		if (NoOfCamerasinPhone1 > NoOfCamerasinPhone2) {
			return Phone1;
		} else if (NoOfCamerasinPhone1 < NoOfCamerasinPhone2) {
			return Phone2;
		} else {
			return "Tie!";
		}
	}

	boolean Wins(String phonename) {
		boolean wins = false;
			if (phonename.equals(WhoWins())) {
				wins = true;
			}
		return wins;
	}

	boolean Games(String phonename) {
		boolean game = false;
		if (phonename.equals(Phone1) || phonename.equals(Phone2)) {
			game = true;
		}
		return game;
	}
}
