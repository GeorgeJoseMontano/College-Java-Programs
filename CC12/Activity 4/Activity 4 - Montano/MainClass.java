/**
  * CC 12 - Activity 4
  * Name: Montano, George Jose P.
  * Date: March 09, 2021
  *
  * Re implement our stack, use linked list. 
  */
class MainClass 
{
  public static void main(String[] args) 
  {
    OurListStack stack = new OurListStack();    // arg the size of the stack

    stack.push(50);
    stack.push(12);
    stack.push(40);
    stack.push(70);
    stack.push(80);

    System.out.print(stack.size());     // => 5
    stack.print();                        // => 50->12->40->70->80

    System.out.println(stack.pop());       // => 80
    System.out.println(stack.pop());       // => 70

    System.out.print(stack.size());     // => 3
    stack.print();                        // => 50->12->40
  }
}
