import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left, right;
    ArrayList<Node> succ;
 
    Node(int value) {
        data = value;
        left = right = null;
        succ = null;
    }
}

public class DAG {
    public void addEdge(Node parent, Node child){
        for (int i = 0; i < parent.succ.size(); i++) {
			if (!child.succ.contains(parent.succ.get(i)))
                child.succ.add(parent.succ.get(i));
		}
    }

    //acyclic(first, second)
    public int findDAGLCA(Node root, Node first, Node second){
        if (first != null && second!= null){
            if (first.succ != null && second.succ != null) {
				for (int i = 0; i < second.succ.size(); i++)
					for (int j = 0; j < first.succ.size(); j++)
						if (second.succ.get(i) == first.succ.get(j))
							return second.succ.get(i).data;
			} else return root.data;
        } return -1;
    }

    public boolean acyclic(Node first, Node second){
        for (int i = 0; i < first.succ.size(); i++){
            if (first.succ.get(i) == second){
                return true;
            }
        }
        return false;
    }

    public void newNode(Node node) {
		node.succ = new ArrayList<Node>();
		node.succ.add(node);
	}
}
