

public class Edge implements EdgeInterface {
	
	private Node node1;
	private Node node2;
	private String label;
	
	public Edge (Node node1, Node node2, String label){
		this.node1= node1;
		this.node2 = node2;
		this.label = label;
		
	}
	

	public Node getNode1() {
		return node1 ;
	}
	
	
	
	public Node getNode2() {
		return node2;
	}
	
	
	
	public String getLabel() {
		return label;
	}
	
	
	
	

	

	

}
