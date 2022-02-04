import java.util.ArrayList;

class RemoveList_Conflict {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(100);
		list.add(200);
		list.add(4);
		list.add(3);
		list.add(7);
		list.add(500);
		list.add(1);
		list.add(777);

		list.remove(2);
		
		// list.remove(7); Integers are used to remove from a given index -- it compiles, but throws IndexOutofBounds Exception during runtime
		// Is there any way to resolve this conflict?
		//
		// Sure!
		// To remove an integer type value, you can convert the 
		// parameter to integer type; this can be achieved by
		// the valueOf method of the Integer class.
		list.remove(Integer.valueOf(1));


		list.remove(1);

		for (int i = 0; i < 5; ++i) {
			System.out.println(list.get(i));
		}
	}
}
