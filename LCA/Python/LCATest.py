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

        assert LCA.findLCA(root, 4, 5) is 2
        assert LCA.findLCA(root, 4, 6) is 1
        assert LCA.findLCA(root, 3, 4) is 1
        assert LCA.findLCA(root, 2, 4) is 2
  
    def testLongerTree(self):
        root = Node(3)
        root.left = Node(5)
        root.right = Node(1)
        root.left.left = Node(6)
        root.left.right = Node(2)
        root.right.left = Node(0)
        root.right.right = Node(8)
        root.left.right.left = Node(7)
        root.left.right.right = Node(4)

        assert LCA.findLCA(root, 5, 4) is 5