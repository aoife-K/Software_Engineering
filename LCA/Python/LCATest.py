import LCA

class TestLowestCommonAncestor:
    def testEmpty(self):
        root = None

        lca = LCA.findLCA(root, 1, 2)

        assert lca is -1

    def testSimpleTree(self):
  
    def testLongerTree(self):
        