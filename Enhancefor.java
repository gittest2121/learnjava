import java.util.ArrayList;

class Enhancefor {
	public static void main(String[] args) {

		ArrayList<String> teachers = new ArrayList<>();

		teachers.add("Simon");
		teachers.add("Samuel");
		teachers.add("Ann");
		teachers.add("Anna");

		for (String teacher : teachers) {
			System.out.println(teacher);
		}

		/* This is doing
		 * for (int i = 0; i < teachers.size(); i++) {
		 *     String teacher = teachers.get(i);
		 *
		 *     System.out.println(teacher);
		 *
		 */

	}
}

/*
 * for (TypeofVariable nameOfVariable: nameOfList)
 *
 * for (int i = 0; i < nameOfList.size(); i++) {
 *     TypeofVariable nameOfVariable = nameOfList.get(i);
 * }
 *
 * ,where,
 *     TypeOfVariable = list's element type
 *     nameOfVariable = variable that is used to store each value in the list
 *                      as we go through it.
 *
 */
