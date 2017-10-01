package com.dataStructure.rk.graph;

import java.util.LinkedList;

/**
 * 
 * @author Rajendar Kumar
 *
 */
public class UndirectedAdjacencList {

	public static void main(String[] args) {
		 	int V = 5;
	        Graph graph = new Graph(V);
	        addEdge(graph, 0, 1);
	        addEdge(graph, 0, 4);
	        addEdge(graph, 1, 2);
	        addEdge(graph, 1, 3);
	        addEdge(graph, 1, 4);
	        addEdge(graph, 2, 3);
	        addEdge(graph, 3, 4);
	        printGraph(graph);
	}
	/**
	 * <p>This method will add the vertex to adjacent node.<p>
	 * <ol>
	 * 		<li>It accepts graph, source and destination.</li>
	 * 		<li>Add the destination to source.</li>
	 * 		<li>Add the source to destination as this is undirected graph.</li>
	 * 		<li><b>Ex. Input</b></li>
	 * 		int V = 5;<br>Graph graph = new Graph(V);<br>addEdge(graph, 0, 1);<br>
	 * 		addEdge(graph, 0, 4);<br>addEdge(graph, 1, 2);<br>addEdge(graph, 1, 3);<br>
	 * 		addEdge(graph, 1, 4);<br>addEdge(graph, 2, 3);<br>addEdge(graph, 3, 4);<br>
	 * 
	 * </ol>
	 * @param graph
	 * @param src
	 * @param dest
	 */
	public static void addEdge(Graph graph, int src, int dest) {
		graph.adjVertex[src].addFirst(dest);
		graph.adjVertex[dest].addFirst(src);
	}

	/**
	 * <ol>
	 * 		<li>Accepts the graph object and prints the all node and vertexes associated\attached to each node.</li>
	 * 		<li><b>Ex. Output</b></li>
	 * 		Vertex --> 0 is connect to :  --> 4 --> 1<br>
	 *		Vertex --> 1 is connect to :  --> 4 --> 3 --> 2 --> 0<br>
	 *		Vertex --> 2 is connect to :  --> 3 --> 1<br>
	 *		Vertex --> 3 is connect to :  --> 4 --> 2 --> 1<br>
	 *		Vertex --> 4 is connect to :  --> 3 --> 1 --> 0<br>
	 * <ol>
	 * @param graph
	 */
	public static void printGraph(Graph graph) {
		LinkedList<Integer> graphes[] = graph.adjVertex;
		for (int i = 0; i < graphes.length; i++) {
			System.out.print("Vertex --> " + i + " is connect to : ");
			for (Integer integer : graphes[i]) {
				System.out.print(" --> " + integer);
			}
			System.out.println();
		}
	}
	static class Graph {
		private int vertex;
		private LinkedList<Integer> adjVertex[];
		@SuppressWarnings("unchecked")
		Graph(int vertex) {
			this.vertex = vertex;
			adjVertex = new LinkedList[this.vertex];
			for (int i = 0; i < this.vertex; i++) {
				adjVertex[i] = new LinkedList<>();
			}
		}
	}
}
