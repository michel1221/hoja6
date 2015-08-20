
/**
 *
 * @author michel Franchesco 
 * @author Luis Ruano
 * @author Luis Pedro velazques
 * @param <E>
 */
public class CircularList<E> extends abstractLista<E>{

    /**
     * Este es un atributo para poder utilizar nodos 
     */
    protected Node<E> tail; 

    /**
     *Este es un atributo del contador 
     */
    protected int count;

    /**
     *este es el constructor de la clase de circular
     */
    public CircularList()
// pre: constructs a new circular list
{
   tail = null;
   count = 0;
}

public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
{
   Node<E> temp = new Node<E>(value);
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}


public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
{
   // new entry:
   addFirst(value);
   tail = tail.next();
}


// lo dificil es quitar el elemento de la cola

public E removeLast()
// pre: !isEmpty()
// post: returns and removes value from tail of list
{
   Node<E> finger = tail;
   while (finger.next() != tail) {
       finger = finger.next();
   }
   // finger now points to second-to-last value
   Node<E> temp = tail;
   if (finger == tail)
   {
       tail = null;
   } else {
       finger.setNext(tail.next());
       tail = finger;
   }
   count--;
   return temp.value();
}
public E removeFirst(){
	
	Node<E> temp = tail.next();
	tail.setNext(temp.next());
	count--;
	return temp.value();
	
}
 public E getFirst()
 {
	 return null;
}
public int size()
{
	return count;
	 
}

}