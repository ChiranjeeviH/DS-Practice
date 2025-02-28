package com.chiru.ds.practice.tree.medium;

/*

 */


import java.util.ArrayList;

public class SerializeAndDeSerialize {

    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        serializeHelper(root, result);
        return result;
    }

    private void serializeHelper(Node root, ArrayList<Integer> result) {
        if (root == null) {
            result.add(null); // Represent null by adding a special marker
            return;
        }

        result.add(root.data);  // Add root node value
        serializeHelper(root.left, result);  // Recursively serialize left subtree
        serializeHelper(root.right, result); // Recursively serialize right subtree
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        // Use an index to track the position in the array during recursive calls
        int[] index = {0};
        Node root = deSerializeHelper(arr, index);
        return root;
    }

    // Helper function for deserialization
    private Node deSerializeHelper(ArrayList<Integer> arr, int[] index) {
        if (index[0] >= arr.size()) {
            return null;
        }

        // Read the next element in the array
        Integer value = arr.get(index[0]);

        // If the value is null, this indicates a null node
        if (value == null) {
            index[0]++; // Move to the next element in the list
            return null;
        }

        // Otherwise, create a new node
        Node node = new Node(value);
        index[0]++; // Move to the next element in the list

        // Recursively build the left and right subtrees
        node.left = deSerializeHelper(arr, index);
        node.right = deSerializeHelper(arr, index);

        return node;
    }

        // Function to print in-order traversal (just to verify the output)
        public void printInOrder(Node root) {
            if (root == null) return;
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }


        public static void main(String[] args) {
            // Creating a sample tree
            Node root = new Node(10);
            root.left = new Node(20);
            root.right = new Node(30);
            root.left.left = new Node(40);
            root.left.right = new Node(60);

            SerializeAndDeSerialize tree = new SerializeAndDeSerialize();

            // Serializing the tree
            ArrayList<Integer> serializedTree = tree.serialize(root);
            System.out.println("Serialized Tree: " + serializedTree);

            // Deserializing the tree
            Node deserializedTree = tree.deSerialize(serializedTree);

            // Printing the in-order traversal of the deserialized tree
            System.out.print("In-order Traversal of Deserialized Tree: ");
            tree.printInOrder(deserializedTree);
    }

}
