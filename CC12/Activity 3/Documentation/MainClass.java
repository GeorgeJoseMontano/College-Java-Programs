/**
  * CC 12 - B
  * MainClass
  */
class MainClass {

  public static void main(String args[]) {

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

    list.delete(8);
    System.out.println("the size of the list is: " + list.getSize());
    list.printList();
    System.out.println();
    System.out.println();

    list.delete(5);
    System.out.println("the size of the list is: " + list.getSize());
    list.printList();
    System.out.println();
  }
}
