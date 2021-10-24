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
    public void addEdge(){

    }

    

    public void findDAGLCA(){
        
    }

    public boolean acyclic(){
        return false;
    }
}
