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
    }

    @Test
    public void testLongerDAG()
    {
        DAG graph = new DAG();
    }

    @Test
    public void testOneNodeDAG()
    {
        DAG graph = new DAG();
    }

    @Test
    public void testWrongDAG()
    {
        DAG graph = new DAG();
    }
}
