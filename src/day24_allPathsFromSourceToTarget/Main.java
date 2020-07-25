package day24_allPathsFromSourceToTarget;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> input = new ArrayList<>();
		List<Integer> lst1 = new ArrayList<>();
		List<Integer> lst2 = new ArrayList<>();
		List<Integer> lst3 = new ArrayList<>();
		List<Integer> lst4 = new ArrayList<>();
		lst1.add(1);
		lst1.add(2);
		input.add(lst1);
		lst2.add(3);
		input.add(lst2);
		lst3.add(3);
		input.add(lst3);
		input.add(lst4);

		List<List<Integer>> output = new ArrayList<>();
		FindAllPaths findAllPaths = new FindAllPaths();
		output = findAllPaths.allPathsSourceTarget(input);

		for (int i = 0; i < output.size(); i++) {
			for (int j = 0; j < output.get(i).size(); j++) {
				System.out.print(output.get(i).get(j) + ", ");
			}
			System.out.println();
		}
	}

}
