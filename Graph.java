import java.util.*;

public class Graph implements GraphInterface {
	//Each node in the graph is a key pointing to all edges which use the node.
	Map<Node, ArrayList<Edge>> multiGraph = new HashMap<Node, ArrayList<Edge>>();
	ArrayList<Edge> edgeList = new ArrayList<Edge>();
	ArrayList<Node> nodeList = new ArrayList<Node>();
	
	
	public void addEdge(Node m, Node n, int ID) {
		//Create edge first and add it to the edgeList.
		Edge newEdge = new Edge(n, n, ID);
		
	}
	
	public void removeEdge(Node m, Node n) {
		// TODO Auto-generated method stub
	}
	
	public class Graph implements GraphInterface {
		Nodes graphNodes = new Nodes();
		Edges graphEdges = new Edges();
		
		
		public void addEdge(Integer edgeID, int node1, int node2) {
			this.graphEdges.addEdge(edgeID, node1, node2);
		}
		
		public void addNode(int ID) {
			graphNodes.addNode(ID);
		}
		
		public boolean isEdge(int m, int n) {
			return graphEdges.checkEdge(m, n);
		}
		
		

		
	 
	 
	     
	   
	}}

	