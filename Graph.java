import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Graph implements GraphInterface {
	 Map <Node, ArrayList <Edge> > mapList = new HashMap <Node, ArrayList <Edge>>();
	 Map <Node, Edge> direction= new HashMap <Node, Edge>();
     ArrayList<Node> shortestPath = new ArrayList<Node>();


     public ArrayList<Edge> getAdjacents(Node node){
    	 	return new ArrayList <Edge>(mapList.get(node));
    	   }
     
     public int numberOfNodes(){
    	 return Graph.size();
     }
      
      public Node getNeighbour(Edge adjacents){
    	  return  adjacents.getNode2();
      }
      
      public String getLabel(Edge adjacents){
    	  return adjacents.getLabel();
      }
      
      
public ArrayList<Node> findShortestPath(Node sourceNode, Node destNode){
		
	ArrayList<Node> path = new ArrayList <Node>();
    	 
	if (sourceNode == destNode) {
    		  System.out.println("Source and destination nodes are same!!");
    		 return null;}
    	  
    	  Queue<Node> q = new LinkedList<Node>();
    	  Queue<Node> visited = new LinkedList<Node>();
    	  
    	  q.add(sourceNode);
    	  
    	  while (!q.isEmpty()){
    		  Node v = q.remove();
    		  visited.add(v);
    		  
    		  ArrayList <Edge> adjConnections = getAdjacents(v);
    		  ArrayList <Node> adjNodes = new ArrayList<Node>();
    		  
    		  for (int i = 0; i< adjConnections.size(); i++){
    			  Node adjNode  = adjConnections.get(i).getNode2();
    			  adjNodes.add(adjNode);
    			 }
    		  int j =0;
    		  
    		  while (j!=adjNodes.size()){
    			  Node neighbour = adjNodes.get(j);
    			  path.add(neighbour);
    			  path.add(v);
    			  
    			  if (neighbour.equals(destNode)){
    				  return getPath(sourceNode, destNode, path);
    			  }
    			  else {
    				  if (!visited.contains(neighbour)){
    					  q.add(neighbour);
    				  }
    			  }
    			  j++;
    		  }
    		  
    	  }
    	  return null;
    	  
   }
  	private ArrayList <Node> getPath(Node sourceNode, Node destNode, ArrayList <Node>path){
  		int i = path.indexOf(destNode);
  		Node src = path.get(i+1);
  		shortestPath.add(0, destNode);
  		
  		if (src.equals(sourceNode)){
  			shortestPath.add(0,sourceNode);
  			return shortestPath;
  		}
  		else{ 
  			return getPath (sourceNode, src,path);
  		}
  	}
  	
  	public void printPath (Node sourceNode, Node destNode){
  		ArrayList <Node> finalPath =findShortestPath (sourceNode, destNode);
  		ArrayList <String> nodNames = new ArrayList <String>();
  		ArrayList <Edge> labels = new ArrayList <Edge>();
  		
  		for(int i =0; i<finalPath.size();i++){
  			nodNames.add(finalPath.get(i).getName());
  			
  			ArrayList<Edge> a = mapList.get(finalPath.get(i));
  			for(int j=0; j<a.size();j++){
  				if (nodNames.get(i+1).equals(a.get(j))){
  					Edge connected = a.get(j);
  					labels.add(connected);
  				}
  			}
  			}
  		
  		for (int k=0; k<labels.size(); k++){
  			String startPoint = labels.get(k).getNode1().getName();
  			String line = labels.get(k).getLabel();
  			String endPoint = labels.get(k).getNode2().getName();
  			if (line.equals(labels.get(k+1).getLabel())){
  				endPoint = labels.get(k+1).getNode2().getName();
  				System.out.print("From"+startPoint+ " use"+ line + "till"+ endPoint);
  				k++;
  			}
  			else {
  			System.out.print("From"+startPoint+ " use"+ line + "till"+ endPoint);
  		}}
  		
  		
  	}
 
    
}