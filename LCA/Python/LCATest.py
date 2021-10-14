import LCA

class TestLowestCommonAncestor:
    def testEmpty(self):
        root = None

        lca = LCA.findLCA(root, 1, 2)

        assert lca is -1

    def testSimpleTree(self):
        root = Node(1)
        root.left = Node(2)
        root.right = Node(3)
        root.left.left = Node(4)
        root.left.right = Node(5)
        root.right.left = Node(6)
        root.right.right = Node(7)

        lca = LCA.findLCA(root, 4, 5)

        assert lca.value is 2
  
    def testLongerTree(self):
        