

/**
  * @author michel Franchesco 
 * @author Luis Ruano
 * @author Luis Pedro velazques
 * @param <E>
 */
public interface Lista<E> 
{

    /**
     * sirve para poder  conseguir el tamaño de la cadena
     * @return
     */
    public int size();
   // post: returns number of elements in list

    /**
     * sirve para poder saber si la lista esta vacia
     * @return
     */
    public boolean isEmpty();
   // post: returns true iff list has no elements
    
    /**
     *sirve para poder conseguir el primer  valor de la cadena
     * @param value
     */
    public void addFirst(E value);
   // post: value is added to beginning of list
   
    /**
     *sirve para quitar el primer valor de la cadena
     * @return
     */
    public E removeFirst();
   
    /**
     *sirve para poder conseguir el primer valor de la lista
     * @return
     */
    public E getFirst();
   
    /**
     * sirve para poder quitar el valor de la lista
     * @return
     */
    public E removeLast();
   
    /**
     * sirve para para agragar un ultimo valor lista 
     * @param value
     */
    public void addLast(E value);
}
