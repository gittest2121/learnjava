class Box {

	private String name;
	private String opp;
	private int capacity;
	private int oppcapacity;
	
	public Box(String name, String opp, int capacity, int oppcapacity) {
		this.name = name;
		this.opp = opp;
		this.capacity = capacity;
		this.oppcapacity = oppcapacity;
	}

	String BestAbilityToFill() {
		if (capacity > oppcapacity) {
			return name;
		} else if (capacity < oppcapacity) {
			return opp;
		} else {
			return "Both";
		}
	}

	boolean Wins(String name) {
		boolean wins = false;
		if (BestAbilityToFill().equals(name)) {
			wins = true;
		}

		return wins;
	}
}
