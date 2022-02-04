import java.util.ArrayList;

class Program {
	public static void main(String[] args) {
		// declare a list
		ArrayList<Integer> list = new ArrayList<>();

		// intialize the list
		for (int i = 0; i < 35; ++i) {
			list.add(i);
		}

		list.add(777);
		System.out.println(list);
	}
}
