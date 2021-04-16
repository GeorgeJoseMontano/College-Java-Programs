/**
  * CC 12 - break;
  * Sample Node
  */
class Node {

    int data;
    Node nextNode;

    // constructors
    public Node() {

    }

    public Node(int data) {

      this.data = data;
    }

    public Node(int data, Node next) {

      this.data     = data;
      this.nextNode = next;
    }

    // setters and getters
    public void setData(int data) {

      this.data = data;
    }

    public void setNextNode(Node next) {

      this.nextNode = next;
    }

    public int getData() {

      return this.data;
    }

    public Node getNextNode() {

      return this.nextNode;
    }
}
