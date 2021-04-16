/**
  * CC 12 B
  * 8 March 2021
  */
class MainClass {

  public static void main(String[] args) {

      OurStack stack = new OurStack(5);    // arg the size of the stack

      stack.push(50);
      stack.push(12);
      stack.push(40);
      stack.push(70);
      stack.push(80);

      System.out.println(stack.size());     // => 5
      stack.print();                        // => 50->12->40->70->80

      System.out.println(stack.pop());       // => 80
      System.out.println(stack.pop());       // => 70

      System.out.println(stack.size());     // => 3
      stack.print();                        // => 50->12->40

      System.out.println(stack.pop());      // => 40
      System.out.println(stack.pop());      // => 12
      System.out.println(stack.pop());      // => 50
      System.out.println(stack.pop());      // empty
  }
}
