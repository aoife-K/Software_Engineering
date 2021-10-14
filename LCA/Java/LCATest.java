import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LCATest {
    
    @Test
    public void testEmpty()
    {
        LCA tree = new LCA();

        assertEquals("Test Empty Tree",-1, tree.findLCA(1,2));
        
    }

    @Test
    public void testSimpleTree()
    {
        LCA tree = new LCA();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        assertEquals("LCA(4, 5): ",2, tree.findLCA(4,5));
        assertEquals("LCA(4, 6): ",1, tree.findLCA(4,6));
        assertEquals("LCA(3, 4): ",1, tree.findLCA(3,4));
        assertEquals("LCA(2, 4): ",2, tree.findLCA(2,4));
        
    }

    @Test
    public void testLongerTree()
    {
        LCA tree = new LCA();
        tree.root = new Node(3);
        tree.root.left = new Node(5);
        tree.root.right = new Node(1);
        tree.root.left.left = new Node(6);
        tree.root.left.right = new Node(2);
        tree.root.right.left = new Node(0);
        tree.root.right.right = new Node(8);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right = new Node(4);

        assertEquals("LCA(5,4): ",5, tree.findLCA(5,4));
    }

}