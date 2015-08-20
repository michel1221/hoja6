
/**
 *
 * @author michel Ramirez
 * @author Luis Eduardo
 * @author Luis Pedro
 * @param <E>
 */
public interface Stack<E> 
{

    /**
     *sirve para poder  meter un valor
     * @param item
     */
    public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
    /**
     * sirve para poder sacar un valor 
     * @return
     */
    public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
    /**
     * sirve para poder agarrar un valor del stack
     * @return
     */
    public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
    /**
     * sirve para pdoer vaciar el experimento
     * @return
     */
    public boolean empty();
   // post: returns true if and only if the stack is empty
   
    /**
     *sirve para poder tener el valor del stack
     * @return
     */
    public int size();
   // post: returns the number of elements in the stack

}