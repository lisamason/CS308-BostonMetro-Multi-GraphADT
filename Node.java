import java.util.ArrayList;

public class Node implements NodeInterface {

	ArrayList<Integer> nodes = new ArrayList<Integer>();
	
	public void addNode(int ID){
		nodes.add(ID);
	}

}