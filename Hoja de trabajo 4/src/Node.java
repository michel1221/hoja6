

/**
 *
 * @author michel Ramirez
 * @author Luis Eduardo
 * @author Luis Pedro
 * @param <E>
 */
public class Node<E> {

    /**
     * guarda el elemento
     */
    protected E data; // value stored in this element

    /**
     * Sirve para apuntar al siguiente elemento de la lista
     */
    protected Node<E> nextElement; // ref to next

    /**
     * sirve para apuntar al elemnto de atras
     */
    protected Node<E> lastElement; // ref al anterior 

    /**
     * Es el constructor de la clase  normal
     * @param v
     * @param next
     * @param before
     */
    public Node(E v, Node<E> next, Node<E> before)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       lastElement = before;
       nextElement = next;
   }

    /**
     * es el constructor de la clase aleatorio 
     * @param v
     */
    public Node(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null,null);
   }

    /**
     * sirve para apuntar al siguiente elemento de la lista
     * @return
     */
    public Node<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

    /**
     *sirve para apuntar al elemento anterior de la lista
     * @return
     */
    public Node<E> before()
   {       
       return lastElement;
   }
   
    /**
     * sirve para poder poner un elemento  atras
     * @param last
     */
    public void setLast(Node<E> last)
   {
       lastElement = last;
   }
   
    /**
     * sirve para poder poner el nodo al siguiente apuntar
     * @param next
     */
    public void setNext(Node<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

    /**
     * sirve para poder returnar el valor
     * @return
     */
    public E value()
   // post: returns value associated with this element
   {
      return data;
   }

    /**
     * sirve para meter un valor 
     * @param value
     */
    public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
    
}
