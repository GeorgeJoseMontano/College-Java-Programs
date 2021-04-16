/**
  * CC 12 - B
  * Linked List
  */

class LinkedList {

    Node head;
    int size;

    // constructor
    public LinkedList() {

      this.head = new Node();
      this.size = 0;
    }

    public void setSize(int size) {

      this.size = size;
    }

    public int getSize() {

      return this.size;
    }

    /**
      * Add a new node into the beginning of the List
      * put the data into the new node
      * @param data int The data to be saved into the node
      * @return newNode Node the newly created node
      */
    public Node prepend(int data) {

        Node newNode = new Node(data, this.head);
        this.head    =  newNode;
        this.size++;
        return newNode;
    }

    /**
      * Delete an element of the list (based on data)
      * @param data int The data to be deleted
      * @return boolean true if deletion is successful, otherwise false
      */
    public boolean delete(int data) {

        Node prevNode = null;
        Node thisNode = this.head;

        while(thisNode.nextNode != null) {

          if (thisNode.getData() == data) {

            prevNode.setNextNode(thisNode.getNextNode());
            this.setSize(this.getSize() - 1);
            return true;
          }

          prevNode = thisNode;
          thisNode = thisNode.getNextNode();
        }

        return false;
    }

    /**
      * Prints all the data (int) of this List
      */
    public void printList() {

      Node thisNode = this.head;

      while(thisNode.nextNode != null) {

        System.out.print(thisNode.data + " -> ");
        thisNode = thisNode.getNextNode();
      }
    }

    /**
      * 1
      * Append data into the list
      * Add a new node at the beginning
      * @param data int The data to be added
      */
    public void append(int data) {


    }

    /**
      * 2
      * Search for data
      * @param data int the data to be searched
      * @return Node the node the contains the data if found, otherwise null
      */
    public Node search(int data) {

    }

    /**
      * 3
      * insert a new node(with data) before a node containing the (before_data)
      * if before_data is not found, append
      * @param data int The data to be added
      * @param before_data int The node containing the data where the new node will be inserted before
      */
    public Node insert(int data, int before_data) {


    }
}
