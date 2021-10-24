import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DAGTest {
    @Test
    public void testEmpty()
    {
       DAG graph = new DAG();
       assertEquals(null, graph.findDAGLCA(null, null, null));
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

        graph.addEdge(1,3);
		graph.addEdge(1,5);
        graph.addEdge(2,3);
        //graph.addEdge(2,5);
        graph.addEdge(2,4);
        graph.addEdge(4,7);
        graph.addEdge(7,6);

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

        graph.addEdge(0,1);
		graph.addEdge(0,2);
        graph.addEdge(1,4);
        graph.addEdge(1,6);
        graph.addEdge(2,4);
        graph.addEdge(2,6);
        graph.addEdge(2,3);
        graph.addEdge(3,6);
        graph.addEdge(6,5);
        graph.addEdge(6,7);
        graph.addEdge(7,8);

        assertEquals(1, graph.findDAGLCA(n0, n4, n7));
        assertEquals(2, graph.findDAGLCA(n0, n4, n7));
        assertEquals(6, graph.findDAGLCA(n0, n5, n8));
        assertEquals(2, graph.findDAGLCA(n0, n6, n3));
        assertEquals(0, graph.findDAGLCA(n0, n4, n2));
        
    }

    @Test
    public void testOneNodeDAG()
    {
        DAG graph = new DAG();
        Node n1 = new Node(1);
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
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        graph.addEdge(1,3);
		graph.addEdge(5,1);
        graph.addEdge(2,3);
        graph.addEdge(3,5);
        graph.addEdge(2,4);

        assertEquals(null, graph.findDAGLCA(n1, n3, n5));
    }
}
