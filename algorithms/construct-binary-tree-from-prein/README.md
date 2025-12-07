## Construct Binary Tree from Preorder and Inorder Traversal

This directory contains solutions for the problem: **Construct Binary Tree from Preorder and Inorder Traversal**.

### Problem Description

Given two integer arrays `preorder` and `inorder` where `preorder` is the preorder traversal of a binary tree and `inorder` is the inorder traversal of the same tree, construct and return the binary tree.

**Example:**
```
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
```

### Approach

- Use recursion to build the tree.
- The first element in `preorder` is always the root.
- Find the root in `inorder` to determine left and right subtrees.
- Recursively construct left and right subtrees.