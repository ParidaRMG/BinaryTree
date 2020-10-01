class Node
{
  String element;
  Node left;            // Left child
  Node right;           // Right child
  Node(String e, Node left, Node right) {
      element = e;
      left = null;
      right = null;
  }

  public static Node TreeInsert(Node root, Node newNode) {
    return root;
  }


}
