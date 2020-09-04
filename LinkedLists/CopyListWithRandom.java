/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
// HashMap which holds old nodes as keys and new nodes as its values.
    HashMap<Node, Node> hashMap = new HashMap<Node, Node>(); // O(n) space
    
  public Node copyRandomList(Node head) { // O(n) time
      if(head == null) { // base case
          return null;
      }

      // If we have already processed the current node, then we simply return the cloned version of
    // it.
      if(this.hashMap.containsKey(head)) {
          return this.hashMap.get(head); // returning the cloned version of the current node
      }
      
      // Create a new node with the value same as old node. (i.e. copy the node)
      Node node = new Node(head.val, null, null);
      
      // Save this value in the hash map. This is needed since there might be
    // loops during traversal due to randomness of random pointers and this would help us avoid them.
      this.hashMap.put(head, node);
      

    // Recursively copy the remaining linked list starting once from the next pointer and then from the random pointer.
    // Thus we have two independent recursive calls.
    // Finally we update the next and random pointers for the new node created.
      node.next = this.copyRandomList(head.next);
      node.random = this.copyRandomList(head.random);
    
      return node;
  }
}