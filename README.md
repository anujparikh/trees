# Tree Data Structure

### Introduction
A __tree__ is a collection of entities called nodes. 
Nodes are connected by edges. Each node contains a value or data, and it may or may not have a child node .
Unlike Arrays, Linked Lists, Stack and queues, which are linear data structures, trees are hierarchical data structures
- The first node of the tree is called the __root__. If this root node is connected by another node, the root is then a parent node and the connected node is a __child__.
- All Tree nodes are connected by links called __edges__. It’s an important part of trees, because it’s manages the relationship between nodes.
- __Leaves__ are the last nodes on a tree. They are nodes without children. 
- The __height__ of a tree is the length of the longest path to a leaf
- The __depth__ of a node is the length of the path to its root

### Types of Trees

#### Binary Trees
- A __binary tree__ is a tree data structure in which each node has at the most two children, which are referred to as the left child and the right child.
- Binary tree contains following parts
    - Data
    - Pointer to left child
    - Pointer to right child
- Properties of Binary Tree
    - The maximum number of nodes at level `l` of a binary tree is `2^l`.
    - Maximum number of nodes in a binary tree of height `h` is `2^(h – 1)` (Considering root node as h = 1)
    - Maximum number of nodes in a binary tree of height `h` is `2^(h + 1) - 1` (Considering root node as h = 0)
    - Maximum number of internal node in a binary tree of height `h` is `2^(h) - 1`
    - A binary tree with `n` leaves has height at least `log(n)`
- Types of Binary Tree
    - __Full Binary Tree:__ A Binary Tree is full if every node has 0 or 2 children. We can also say a full binary tree is a binary tree in which all nodes except leaves have two children
    - __Complete Binary Tree:__ A Binary Tree is complete Binary Tree if all levels are completely filled except possibly the last level and the last level has all keys as left as possible
    - __Perfect Binary Tree:__ A Binary tree is Perfect Binary Tree in which all internal nodes have two children and all leaves are at the same level
    - __Balanced Binary Tree:__ A binary tree is balanced if the height of the tree is O(Log n) where n is the number of nodes. Balanced Binary Search trees are performance wise good as they provide O(log n) time for search, insert and delete
    - __Degenerated Binary Tree:__ A Tree where every internal node has one child. Such trees are performance-wise same as linked list
    
#### Binary Search Tree
- __Binary Search Tree__ is a node-based binary tree data structure which has the following properties
    - The left subtree of a node contains only nodes with keys lesser than the node’s key
    - The right subtree of a node contains only nodes with keys greater than the node’s key
    - The left and right subtree each must also be a binary search tree
    - There must be no duplicate nodes
    
#### Tree Traversal
- __In-order traversal__ In this traversal method, the left subtree is visited first, then the root and later the right sub-tree. We should always remember that every node may represent a subtree itself. 
    If a binary tree is traversed in-order, the output will produce sorted key values in an ascending order
- __Pre-order traversal__ In this traversal method, the root node is visited first, then the left subtree and finally the right subtree
- __Post-order traversal__ In this traversal method, the root node is visited last, hence the name. First we traverse the left subtree, then the right subtree and finally the root node

### Examples
- [`Maximum Depth of Binary Tree:`](https://leetcode.com/problems/maximum-depth-of-binary-tree/) [Solution](./src/practice/examples/MaxDepthOfBinaryTree.java) (Easy)
- [`Validate Binary Search Tree:`](https://leetcode.com/problems/validate-binary-search-tree/) [Solution](./src/practice/examples/ValidBST.java) (Easy)
- [`Symmetric Tree:`](https://leetcode.com/problems/symmetric-tree/) [Solution](./src/practice/examples/SymmetricTree.java) (Easy)
- [`Binary Tree Level Order Traversal:`](https://leetcode.com/problems/binary-tree-level-order-traversal/) [Solution](./src/practice/examples/BTLevelOrderTraversal.java) (Easy)
- [`Convert Sorted Array to Binary Search Tree:`](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) [Solution](./src/practice/examples/HeightBalancedBST.java) (Easy)
- [`Binary Tree Inorder Traversal:`](https://leetcode.com/problems/binary-tree-inorder-traversal/) [Solution](./src/practice/examples/BTInorderTraversal.java) (Medium)
- [`Binary Tree Zigzag Level Order Traversal:`](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/) [Solution](./src/practice/examples/BTZigZagLevelOrderTraversal.java) (Medium)
- [`Construct Binary Tree from Preorder and Inorder Traversal:`](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) [Solution](./src/practice/examples/BTFromPreAndInOrderTraversal.java) (Medium)
- [`Populating Next Right Pointers in Each Node:`](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/) [Solution with recursion](./src/practice/examples/NextPointerForEachNode.java) & [Solution with Queue](./src/practice/examples/NextPointerForEachNode2.java) (Medium)
- [`Kth Smallest Element in a BST:`](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) [Solution](./src/practice/examples/KthSmallestBST.java)(Medium)
- [`Number of Islands:`](https://leetcode.com/problems/number-of-islands/) [Solution](./src/practice/examples/NumberOfIslands.java)(Medium)
