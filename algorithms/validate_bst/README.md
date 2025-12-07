# Validate Binary Search Tree

## Problem Description

Given a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:
- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be binary search trees.

## Example

**Input:**
2
    / \
      1   3

**Output:**  
`true`

**Input:**
5
    / \
   1   4
      / \
     3   6
**Output:**  
`false`

## Usage

Implement the function in your preferred language (Java, Python, JavaScript, etc.):

- **Java:**  
  Implement a method `boolean isValidBST(TreeNode root)`

- **Python:**  
  Implement a function `def is_valid_bst(root):`

- **JavaScript:**  
  Implement a function `function isValidBST(root)`

## Testing

You can run unit tests to verify your implementation. Example test cases are provided above.

## License

This project is licensed under the MIT License.