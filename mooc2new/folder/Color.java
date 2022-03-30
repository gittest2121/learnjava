public enum Color {
	// constructor parameters are defned as
	// the constants are enumerated
	RED("#FF0000");
	GREEN("#00FF00");
	BLUE("#0000FF");

	private String code;	// object reference variable

	private Color(String code) {	// constructor
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}
}

// enum Color can be used like
// System.out.println(Color.GREEN.getCode());
