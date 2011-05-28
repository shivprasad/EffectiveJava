package item23.generics;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 27, 2009
 * Time: 12:31:24 PM
 */
public class Stack<E> {

    private static final int DEFAULT_STACKSIZE = 10;

    private E[] items;

    private int top = 0;

    @SuppressWarnings({"unchecked"})
    public Stack() {
        items = (E[]) new Object[DEFAULT_STACKSIZE];
    }

    @SuppressWarnings({"unchecked"})
    public Stack(int capacity){
        items = (E[]) new Object[capacity];
    }

    public void push(E obj){
        if(top == items.length)
            throw new RuntimeException("Stack Overflow!!!");
        items[top++]=obj;
    }

    public E pop(){
        if(top == 0)
            throw new RuntimeException("Empty Stack!!!");
        E o = items[--top];
        items[top]=null;
        return o;
    }
}
