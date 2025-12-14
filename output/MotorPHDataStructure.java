package Output;

import java.util.*;

// Node class for BST
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
    }
}

public class MotorPHDataStructure {

    // ---------- BST Operations ----------
    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);       // Recursion
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static Node insertBST(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insertBST(root.left, val);
        else root.right = insertBST(root.right, val);
        return root;
    }

    public static boolean searchBST(Node root, int val) {
        if (root == null) return false;
        if (root.data == val) return true;
        if (val < root.data) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }

    // ---------- Array Operations ----------
    public static void arrayDemo() {
        System.out.println("\n--- Array Demo ---");
        int[] employeeIDs = {104, 102, 101, 103};
        Arrays.sort(employeeIDs); // Sort & Insert
        System.out.println("Sorted Array: " + Arrays.toString(employeeIDs));

        // Search
        int idx = Arrays.binarySearch(employeeIDs, 102);
        System.out.println("Search 102, index: " + idx);
    }

    // ---------- LinkedList Operations ----------
    public static void linkedListDemo() {
        System.out.println("\n--- LinkedList Demo ---");
        LinkedList<String> employees = new LinkedList<>();
        employees.add("John");
        employees.add("Mary");
        employees.addFirst("Alice"); // Insert at head
        employees.remove("Mary");    // Delete
        Collections.sort(employees); // Sort
        System.out.println("LinkedList: " + employees);
    }

    // ---------- Stack Operations ----------
    public static void stackDemo() {
        System.out.println("\n--- Stack Demo ---");
        Stack<String> undoStack = new Stack<>();
        undoStack.push("Added Employee1");
        undoStack.push("Deleted Employee2");
        System.out.println("Undo Operation: " + undoStack.pop());
        System.out.println("Remaining Stack: " + undoStack);
    }

    // ---------- Queue Operations ----------
    public static void queueDemo() {
        System.out.println("\n--- Queue Demo ---");
        Queue<String> payrollQueue = new LinkedList<>();
        payrollQueue.add("Emp1");
        payrollQueue.add("Emp2");
        System.out.println("Processing: " + payrollQueue.remove());
        System.out.println("Remaining Queue: " + payrollQueue);
    }

    // ---------- Merge Demo for Arrays ----------
    public static void mergeDemo() {
        System.out.println("\n--- Merge Arrays Demo ---");
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] merged = new int[arr1.length + arr2.length];

        int i=0, j=0, k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]) merged[k++] = arr1[i++];
            else merged[k++] = arr2[j++];
        }
        while(i<arr1.length) merged[k++] = arr1[i++];
        while(j<arr2.length) merged[k++] = arr2[j++];
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }

    public static void main(String[] args) {
        // Array
        arrayDemo();

        // LinkedList
        linkedListDemo();

        // Stack
        stackDemo();

        // Queue
        queueDemo();

        // Merge Arrays
        mergeDemo();

        // BST
        System.out.println("\n--- BST Demo ---");
        Node root = null;
        int[] bstValues = {50, 30, 70, 20, 40, 60, 80};
        for(int val : bstValues) root = insertBST(root, val);

        System.out.print("In-order Traversal (Sorted): ");
        inorderTraversal(root); // Recursion
        System.out.println();

        int searchVal = 60;
        System.out.println("Search " + searchVal + ": " + (searchBST(root, searchVal) ? "Found" : "Not Found"));
    }
}