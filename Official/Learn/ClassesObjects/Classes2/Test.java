public class Test {
	static {
		System.out.println("Static");
	}

	{
		System.out.println("Non-static block");
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
	}
}
