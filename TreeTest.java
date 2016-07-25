import java.util.Scanner;

public class TreeTest {
   public static void main (String[] args) {
      Scanner scan = new Scanner (System.in);
      int[] array = {3, 4, 5, 6, 7, 8, 9, 10};
      Node root = BinaryTree.sortedArrayToBST(array, 0, array.length-1);
      while (true) {
         int search = scan.nextInt();
         System.out.println((BinaryTree.search(root, search) ?  "Exists!" : "Does not exist!"));
      }
   }
}

class Node {
   int data;
   Node left, right;

   public Node(int d) {
      data = d;
      left = right = null;
   }
}

class BinaryTree {
   static Node root;
   public static Node sortedArrayToBST (int array[], int start, int end) {
      if (start > end) { //base case
         return null;
      }
      int mid = (start + end) / 2;
      Node node = new Node(array[mid]); //make the mid element the root
      node.left = sortedArrayToBST(array, start, mid-1); //recursively make left subtree
      node.right = sortedArrayToBST(array, mid+1, end); //recursively make right subtree
      return node;
   }

   public static boolean search(Node root, int data){
      if (root == null) return false;
      else if (root.data == data) return true;
      else if (root.data  data) return search(root.left, data);
      else return search(root.right, data);
   }
}
