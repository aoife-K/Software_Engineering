import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DAGTest {
    @Test
    public void testEmpty()
    {
       DAG graph = new DAG();
       assertEquals(-1, graph.findDAGLCA(null, null, null));
    }

    @Test
    public void testSimpleDAG()
    {
        DAG graph = new DAG();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        graph.newNode(n1);
        graph.newNode(n2);
        graph.newNode(n3);
        graph.newNode(n4);
        graph.newNode(n5);
        graph.newNode(n6);
        graph.newNode(n7);

        graph.addEdge(n1,n3);
		graph.addEdge(n1,n5);
        graph.addEdge(n2,n3);
        //graph.addEdge(2,5);
        graph.addEdge(n2,n4);
        graph.addEdge(n4,n7);
        graph.addEdge(n7,n6);

        assertEquals(2, graph.findDAGLCA(n1, n4, n5));
        assertEquals(2, graph.findDAGLCA(n1, n7, n5));
        assertEquals(2, graph.findDAGLCA(n1, n6, n5));
        assertEquals(1, graph.findDAGLCA(n1, n3, n5));
        assertEquals(4, graph.findDAGLCA(n1, n4, n7));
    }

    @Test
    public void testLongerDAG()
    {
        DAG graph = new DAG();
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        graph.newNode(n0);
        graph.newNode(n1);
        graph.newNode(n2);
        graph.newNode(n3);
        graph.newNode(n4);
        graph.newNode(n5);
        graph.newNode(n6);
        graph.newNode(n7);
        graph.newNode(n8);
        

        graph.addEdge(n0,n1);
		graph.addEdge(n0,n2);
        graph.addEdge(n1,n4);
        graph.addEdge(n1,n6);
        graph.addEdge(n2,n4);
        graph.addEdge(n2,n6);
        graph.addEdge(n2,n3);
        graph.addEdge(n3,n6);
        graph.addEdge(n6,n5);
        graph.addEdge(n6,n7);
        graph.addEdge(n7,n8);

        assertEquals(1, graph.findDAGLCA(n0, n4, n7));
        //assertEquals(2, graph.findDAGLCA(n0, n4, n7));
        assertEquals(6, graph.findDAGLCA(n0, n5, n8));
        assertEquals(1, graph.findDAGLCA(n0, n4, n5));
        assertEquals(2, graph.findDAGLCA(n0, n4, n2));
        
    }

    @Test
    public void testOneNodeDAG()
    {
        DAG graph = new DAG();
        Node n1 = new Node(1);
        graph.newNode(n1);
        assertEquals(1, graph.findDAGLCA(n1, n1, n1));
    }

    @Test
    public void testWrongDAG() //tests a cyclic graph 
    {
        DAG graph = new DAG();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        
        graph.newNode(n1);
        graph.newNode(n2);
        graph.newNode(n3);
        graph.newNode(n4);
        graph.newNode(n5);

        graph.addEdge(n1,n3);
		graph.addEdge(n5,n1);
        graph.addEdge(n2,n3);
        graph.addEdge(n3,n5);
        graph.addEdge(n2,n4);

        assertEquals(-1, graph.findDAGLCA(n1, n3, n5));
    }
}
