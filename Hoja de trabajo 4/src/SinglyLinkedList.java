// Universidad del valle de Guatemala
// Michel Ramirez Najera
// carné: 14069
// Luis Eduardo Ruano
// Luis pedro Velezques

/**
 *
 * @author michel Ramirez
 * @author Luis Eduardo
 * @author Luis Pedro
 * @param <E>
 */

public class SinglyLinkedList<E> extends abstractLista<E> {
    
    /**
     *sirve para poder tener un contador de los integrantes de la lista
     */
    protected int count; 
 
    /**
     * sirve para poder apunatr hacia adelante
     */
    protected Node<E> head; 
 
    /**
     *sirve para poder apuntar hacia atras 
     */
    protected Node<E> tail; 

    /**
     *constructor
     */
    public SinglyLinkedList()
   
   {
      head = null;
      count = 0;
      tail = null;
   }
   
    /**
     *sirve para poder consegir el tamaño lista 
     * @return
     */
    public int size()
  
  {
    return count;
  }
  
    /**
     * sirve para ingresar el valor al principioo
     * @param value
     */
    public void addFirst(E value)
  
  {
     
     int item =this.size();
     if (item==0){
        head = new Node<E>(value);
        count++;
     }
     else {
         Node<E> temp= head;
         head = new Node<E>(value);
         count++;
         head.setNext(temp);
     
     }
  }
  
    /**
     * sirve para poder quitar el valor del principio 
     * @return
     */
    public E removeFirst()
 
 {
	Node<E> temp = head;
	head = head.next(); 
	count--;
	return temp.value();
 }
 
    /**
     *sirve para poder conseguir el valor de el`principio 
     * @return
     */
    public E getFirst()
 
 {
     int item =this.size();
     if (item!=0){
	return head.value();
     }
     else 
         return null;
 }
 
    /**
     *sirve para poder poder eleminar el valor del
     * @return
     */
    public E removeLast()
 {
    int item =this.size();
     if (item==0){
        return null;
     }
     
     else {
         Node<E> temp= head;
         Node<E> temp2= temp.next();
         while (temp2.next()!=null){
             temp = temp.next();
             temp2 = temp.next();
         }
         count--;
         temp.setNext(null);
         return temp.value();
     }
 }
  
    /**
     *sirve para poder agregar un archivo al final
     * @param value
     */
    public void addLast(E value)
 {
     int item =this.size();
     if (item==0){
        head = new Node<E>(value);
        count++;
        head.setNext(null);
     }
     
     else {
         Node<E> temp= head;
         while (temp.next()!=null){
             temp = temp.next();
         }
         temp.setNext(new Node<E>(value));
         count++;
         temp.setNext(null);
     }
 }
}
