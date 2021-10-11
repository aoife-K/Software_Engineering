import java.util.ArrayList;
import java.util.List;
 

class Node {
    int data;
    Node left, right;
 
    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class LCA
{

    Node root;
    private List<Integer> path1 = new ArrayList<>();
    private List<Integer> path2 = new ArrayList<>();
 
    int findLCA(int n1, int n2) {
    }
 
    private int findLCAInternal(Node root, int n1, int n2) {
    }
     
    private boolean findPath(Node root, int n, List<Integer> path)
    {
    }
    public static void main(String[] args)
    {
    }
}