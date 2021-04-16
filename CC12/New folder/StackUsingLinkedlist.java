public class StackUsingLinkedlist {
 private Node head; // the first node
 
 // nest class to define linkedlist node
 private class Node {
 int value;
 Node next;
 }
 
 public StackUsingLinkedlist() {
 head = null;
 
 }
 
 // Remove value from the beginning of the list for demonstrating behaviour of stack
 public int pop(){
 if (head == null) {
	System.out.println("Stack is empty");
	return -1;
 }
	int value = head.value;
	head = head.next;
	return value;
 }
 
 // Add value to the beginning of the list for demonstrating behaviour of stack
 public void push(int value) {
	 Node oldHead = head;
	 head = new Node();
	 head.value = value;
	 head.next = oldHead;
 }
 
 
 }