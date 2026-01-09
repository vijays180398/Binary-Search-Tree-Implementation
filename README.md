# Binary Search Tree (BST) Implementation in Java

## 📌 Project Overview

This project demonstrates a **professional and interview-ready implementation of a Binary Search Tree (BST)** using **Java**. The implementation covers all fundamental BST operations including **insertion, deletion, searching, and tree traversals**.

A Binary Search Tree is a hierarchical data structure that stores elements in a sorted manner, enabling efficient operations compared to linear data structures.

This project is suitable for:

* Data Structures & Algorithms practice
* Java backend / SDE-1 interviews
* Academic learning and demonstrations
* Resume and portfolio projects

---

## 🌳 What is a Binary Search Tree?

A **Binary Search Tree (BST)** is a binary tree in which:

* The **left subtree** contains values **less than** the node’s value
* The **right subtree** contains values **greater than** the node’s value
* Both left and right subtrees are also BSTs

This property allows efficient searching, insertion, and deletion operations.

---

## ⚙️ Features Implemented

✔ Node representation using `TreeNode` class
✔ Recursive insertion of elements
✔ Efficient search operation
✔ Deletion handling all three cases:

* Leaf node deletion
* Node with one child
* Node with two children (in-order successor)
  ✔ Tree traversals:
* In-order traversal
* Pre-order traversal
* Post-order traversal

---

## 🧱 Project Structure

```
BinarySearchTree/
│
├── TreeNode.java          // Node structure
├── BinarySearchTree.java // BST operations
└── Main.java              // Driver class for testing
```

---

## 🧩 Class Descriptions

### 1️⃣ TreeNode Class

Represents a single node in the BST.

* Stores the node value
* Maintains references to left and right children

### 2️⃣ BinarySearchTree Class

Contains core logic for BST operations:

* Insert nodes
* Search values
* Delete nodes
* Perform tree traversals

### 3️⃣ Main Class

Acts as a driver program to:

* Build the BST
* Demonstrate traversals
* Validate search and delete operations

---

## 🔄 Tree Traversals

| Traversal Type | Order               | Use Case                      |
| -------------- | ------------------- | ----------------------------- |
| In-order       | Left → Root → Right | Prints values in sorted order |
| Pre-order      | Root → Left → Right | Used to copy tree             |
| Post-order     | Left → Right → Root | Used to delete tree           |

---

## ⏱️ Time Complexity

| Operation | Average Case | Worst Case |
| --------- | ------------ | ---------- |
| Insert    | O(log n)     | O(n)       |
| Search    | O(log n)     | O(n)       |
| Delete    | O(log n)     | O(n)       |
| Traversal | O(n)         | O(n)       |

> Worst case occurs when the BST becomes skewed.

---

## 🚀 How to Run the Project

1. Clone or download the repository
2. Compile the Java files:

   ```bash
   javac Main.java
   ```
3. Run the program:

   ```bash
   java Main
   ```

---

## 🧠 Key Learning Outcomes

* Understanding hierarchical data structures
* Implementing recursion effectively
* Handling edge cases in deletion
* Applying tree traversal techniques
* Improving problem-solving skills for interviews

---

## 📄 Resume Description (Optional)

> Implemented a Binary Search Tree in Java supporting insertion, deletion, search, and depth-first traversals. Designed recursive algorithms with efficient time complexity and handled all node deletion edge cases.

---

## 🏁 Conclusion

This project provides a clean and complete implementation of a Binary Search Tree using Java, following best coding practices. It strengthens core DSA concepts and prepares developers for technical interviews.

---

AUTHOR : Vijaya babu
