package zadaci_12_02_2018;

import java.util.ArrayList;

public class Prvi {
	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();
		list.add(0);
		list.add(5);
		list.add(23);
		System.out.println(max(list));

	}

	public static Integer max(ArrayList<Integer> list) {
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}

		if ((list.isEmpty()) || (list.size() == 0)) {
			return null;
		}
		return max;
	}

}
