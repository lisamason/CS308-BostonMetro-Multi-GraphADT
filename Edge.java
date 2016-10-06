
import java.util.HashMap;
import java.util.Map;

public class Edge implements EdgeInterface {
	
	Map<Integer, int[]> edges = new HashMap<Integer, int[]>();

	public void addEdge(int node1, int node2,Integer edgeID){
		int[] x = new int[2];
		x[0] = node1;
		x[1] = node2;
		
		edges.put(edgeID, x);
	}
	
	public int[] returnEdge(Integer ID){
		return this.edges.get(ID);
	}

	public boolean checkEdge(int m, int n) {
		int[] x = new int[]{m, n};
		int[] y = new int[]{n, m};
		
		if(edges.containsValue(x) || edges.containsValue(y)){
			return true;
			
		}
		
		return false;
		
	}
	
}