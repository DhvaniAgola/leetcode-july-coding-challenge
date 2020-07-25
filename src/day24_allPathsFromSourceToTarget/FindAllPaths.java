package day24_allPathsFromSourceToTarget;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindAllPaths {
	List<List<Integer>> output = new ArrayList<>();

	class Graph {
		LinkedList<Integer> ll[];

		Graph(int n) {
			ll = new LinkedList[n];
			for (int i = 0; i < n; i++) {
				ll[i] = new LinkedList<>();
			}
		}
	}

	void insertEdges(int source, int destination, Graph g) {
		g.ll[source].add(destination);
	}

	List<List<Integer>> allPathsSourceTarget(List<List<Integer>> graph) {
		Graph g = new Graph(graph.size());
		for (int i = 0; i < graph.size(); i++) {
			for (int j = 0; j < graph.get(i).size(); j++) {
				insertEdges(i, graph.get(i).get(j), g);
			}
		}
		preTraverse(g, graph.size());
		return output;
	}

	private void preTraverse(Graph g, int n) {
		// TODO Auto-generated method stub
		boolean[] visited = new boolean[n];
		List<Integer> lst = new ArrayList<>();
		traverse(g, visited, lst, 0, n - 1);
	}

	private void traverse(Graph g, boolean[] visited, List<Integer> lst, int s, int d) {
		// TODO Auto-generated method stub
		visited[s] = true;
		boolean[] visitedTemp = new boolean[visited.length];
		for (int i = 0; i < visited.length; i++)
			if (visited[i])
				visitedTemp[i] = true;

		lst.add(s);
		List<Integer> lstTemp = new ArrayList<>();
		lstTemp.addAll(lst);

		if (s == d)
			output.add(lstTemp);

		for (int i : g.ll[s]) {
			if (!visited[i]) {
				traverse(g, visitedTemp, lstTemp, i, d);
				lstTemp.clear();
				lstTemp.addAll(lst);
				for (int j = 0; j < visited.length; j++)
					if (visited[j])
						visitedTemp[j] = true;
					else
						visitedTemp[j] = false;
			}
		}

	}
}
