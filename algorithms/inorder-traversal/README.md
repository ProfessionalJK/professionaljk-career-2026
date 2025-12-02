# Inorder Traversal Algorithm

## Problem Statement
Implement an algorithm to perform inorder traversal on a binary tree. Inorder traversal visits nodes in the following order: left subtree, root node, right subtree.

## Solution Approach
The algorithm can be implemented using recursion or iteration (using a stack). This project provides solutions in both Java (Spring Boot) and Python.

## Project Structure
- `src/main/java/...` - Java implementation
- `src/main/python/...` - Python implementation

## Usage

### Java
1. Build the project using Maven:
    ```bash
    mvn clean install
    ```
2. Run the application:
    ```bash
    mvn spring-boot:run
    ```
### Python
1. Navigate to the Python source directory.
2. Run the script:
    ```bash
    python Solution.py
    ```

## Example
Given the following binary tree:
```
    1
   / \
  2   3
 / \   \
4   5   6
```
The inorder traversal output will be:
```4, 2, 5, 1, 3, 6```