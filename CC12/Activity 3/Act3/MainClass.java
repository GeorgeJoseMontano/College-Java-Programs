/*
Montano, George Jose P.
20190018801

CC 12 B
Activity 3

Problem: Modify the attached code, and implement the mentioned methods. 

*/
class MainClass {

  public static void main(String args[]) 
  {
    LinkedList list = new LinkedList();

    System.out.println("the current size of the list is: " + list.getSize());
    list.printList();
    System.out.println();

    list.prepend(90);
    list.prepend(5);
    list.prepend(8);
    list.prepend(10);
    System.out.println("the size of the list is: " + list.getSize());
    list.printList();
    System.out.println();
    System.out.println();
	
	list.append(20);
	list.append(2);
	System.out.println("the size of the list is: " + list.getSize());
    list.printList();
    System.out.println();
    System.out.println();
	
	list.insert(list.head.next, 12);
	list.insert(list.head.next, 24);
	list.insert(list.head.next, 48);
	System.out.println("the size of the list is: " + list.getSize());
    list.printList();
    System.out.println();
    System.out.println();
	
	if (list.search(list.head, 69)) 
        System.out.println("The value was found"); 
    else
        System.out.println("The value was not found");
	System.out.println();
    System.out.println();
	
	if (list.search(list.head, 10)) 
        System.out.println("The value was found"); 
    else
        System.out.println("The value was not found");
	System.out.println();
    System.out.println();
  }
}
