import java.util.ArrayList;

class RemoveList {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");


		list.remove(1);
		list.remove("Fourth");

		System.out.println("Index 0 -- first value -- " + list.get(0));
		System.out.println("Index 1 -- second value -- " + list.get(1));
		System.out.println("Index 2 -- third value -- " + list.get(2));
	}
}
