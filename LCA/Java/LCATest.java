import static org.junit.Assert.fail;

import org.junit.Test;

public class LCATest {
    
    // @Test
    // public void testEmpty()
    // {
    //     LCA tree = new LCA();

    //     assertEquals("Test Empty Tree",, tree.findLCA(1,2));
        
    // }

    @Test
    public void testLongTree()
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
    public void testShortTree()
    {
        LCA tree = new LCA();

    }

}