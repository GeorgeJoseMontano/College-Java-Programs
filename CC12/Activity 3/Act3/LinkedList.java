class LinkedList 
{ 
    Node head;  
	
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
        
    } 
    int size = 0;
        public void setSize(int size) {

            this.size = size;
          }      
        public int getSize() {

            return this.size;
          }

    public void prepend(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
        this.size++;
    } 
    /** 1
    * Append data into the list
    * Add a new node at the beginning
    * @param data int The data to be added
    */
      public void append(int new_data) 
      {
          Node new_node = new Node(new_data); 
    
          if (head == null) 
          { 
              head = new Node(new_data); 
              return; 
          } 

          new_node.next = null; 

          Node last = head;  
          while (last.next != null) 
              last = last.next; 
			  
          last.next = new_node;         this.size++;
          return; 
      } 

	/**2
    * Search for data
    * @param data int the data to be searched
    * @return Node the node the contains the data if found, otherwise null
    */
      public boolean search(Node head, int x) 
    { 
        Node thisnode = head;
        while (thisnode != null) 
        { 
            if (thisnode.data == x) 
                return true;
            thisnode = thisnode.next; 
            
        } 
        return false;
    } 
    
	/**3
    * insert a new node(with data) before a node containing the (before_data)
    * if before_data is not found, append
    * @param data int The data to be added
    * @param before_data int The node containing the data where the new node will be inserted before
    */
    public void insert(Node prev_node, int new_data) 
    { 
        if (prev_node == null) 
        { 
            append(new_data);
            return; 
        } 
        Node new_node = new Node(new_data);         
        new_node.next = prev_node.next; 
        prev_node.next = new_node; 
        this.size++;
    } 
     
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
}
