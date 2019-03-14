## Week 3 Agenda
- Tree ADT & Terminology
- Tree Traversal Algorithm
- Binary Tree
- Recursive Code on Tree

### Tree Terminology

![tree terminology](https://github.com/psui3905/COMP2123/blob/master/week3/tree_t1.png)


![tree terminology](https://github.com/psui3905/COMP2123/blob/master/week3/tree_t2.png)

### Substraucture of a Tree

> Assume there is a tree C

![tree terminology](https://github.com/psui3905/COMP2123/blob/master/week3/tree_t3.png)

- Height of a tree: **Maximum depth** of the tree

- Subtree: tree made up of some node and its descendants, but the subtree is a part of C

-  Edge: pair of nodes (u, v) such that one is the parent of the other

- Path: sequence of nodes such that 2 consecutive nodes in the sequence have an edge (e.g., <E, B, F, J>).

### Tree Traversal Algortithm

- Pre-order traversal
![tree terminology](https://github.com/psui3905/COMP2123/blob/master/week3/Preorder_Traversal.png)

- Post-order traversal
![tree terminology](https://github.com/psui3905/COMP2123/blob/master/week3/Postorder_Traversal.png)

- In-order traversal
![tree terminology](https://github.com/psui3905/COMP2123/blob/master/week3/Inorder_Traversal.png)


![tree terminology](https://github.com/psui3905/COMP2123/blob/master/week3/traversal.png)

#### Binary Search Tree
* Binary Search Tree is a node-based binary tree data structure which has the following properties:

    > The left subtree of a node contains only nodes with keys lesser than the node’s key.

    > The right subtree of a node contains only nodes with keys greater than the node’s key.

    > The left and right subtree each must also be a binary search tree.