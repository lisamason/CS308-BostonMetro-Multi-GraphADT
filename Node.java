
public class Node implements NodeInterface {

	private String name;
	private int id;
	private boolean visited;
	
	public Node(String name, int id){
		this.name = name;
		this.id = id;
		visited = false;
	
	}

	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	

	public boolean isVisited() {
		return visited;
	}
	
	public void makeVisited(){
		visited = true;
	}
}
