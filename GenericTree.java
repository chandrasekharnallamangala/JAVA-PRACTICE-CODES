package codePractice;

import java.util.*;

public class GenericTree {

class Node {
	int data; // store the data into node
	ArrayList<Node>children; // store links of nodes
	Node(int data){
		this.data=data;
		children = new ArrayList();
	}
}
private Node root;
private int size; // size of tree

public GenericTree() {
	
}

}
