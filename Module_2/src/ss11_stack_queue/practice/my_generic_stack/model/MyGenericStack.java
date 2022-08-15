package ss11_stack_queue.practice.my_generic_stack.model;

import java.util.LinkedList;

public class MyGenericStack<T> {
  private LinkedList<T> stack;
  public MyGenericStack(){
      stack = new LinkedList<>();
  }
  public void push(T element){
      stack.addFirst(element);
  }

}
